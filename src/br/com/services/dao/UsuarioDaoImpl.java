package br.com.services.dao;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.services.model.Usuario;

public class UsuarioDaoImpl {

	
	@Inject
	private EntityManager entityManager;
	
	public List<Usuario> getListaUsuarios() {
		Query query = entityManager.createQuery("select u from Usuario u");
		List<Usuario> usuarios = (List<Usuario>) query.getResultList();
		return usuarios;

	}
	
	
	public Usuario getUsuarioPorId(int id) {
		Usuario usuario = entityManager.find(Usuario.class, id);
		return usuario;
	}

	
	public String adicionarUsuario(Usuario usuario) throws SQLException {
		try {
			//Nesse ponto é necessário a realização das transações, ficando a cargo do CDI. No momento a transação está manual.
			entityManager.getTransaction().begin();
			entityManager.persist(usuario);
			entityManager.getTransaction().commit();
			entityManager.flush();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			return "Problema ao adicionar usuário";
		}
		return "Usuário Adicionado";
	}

	public String atualizarUsuario(Usuario usuario) throws SQLException {
		try {
			//Nesse ponto é necessário a realização das transações, ficando a cargo do CDI. No momento a transação está manual.
			entityManager.getTransaction().begin();
			entityManager.merge(usuario);
			entityManager.getTransaction().commit();
			entityManager.flush();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			return "Problema ao modificar usuário";
		}
		return "Usuário Modificado";
	}


}
