package br.com.services.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.services.model.Estabelecimento;

public class EstabelecimetoDaoImpl {

	public EstabelecimetoDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Inject
	private EntityManager entityManager;

	public List<Estabelecimento> getEstabelecimentos() {
		Query query = entityManager.createQuery("select e from Estabelecimento e");
		List<Estabelecimento> estabelecimentos = (List<Estabelecimento>) query.getResultList();
		return estabelecimentos;
	}

	public Estabelecimento getEstabelecimentoPorId(int id) {
		Estabelecimento estabelecimento = entityManager.find(Estabelecimento.class, id);
		return estabelecimento;
	}

	public String adicionarEstabelecimento(Estabelecimento estabelecimento) {
		try {
			// Nesse ponto � necess�rio a realiza��o das transa��es, ficando a
			// cargo do CDI. No momento a transa��o est� manual.
			entityManager.getTransaction().begin();
			entityManager.persist(estabelecimento);
			entityManager.getTransaction().commit();
			entityManager.flush();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			return "Problema ao adicionar Estabelecimento";
		}
		return "Estabelecimento Adicionado";
	}

	public String atualizarEstabelecimento(Estabelecimento estabelecimento) {
		try {
			// Nesse ponto � necess�rio a realiza��o das transa��es, ficando a
			// cargo do CDI. No momento a transa��o est� manual.
			entityManager.getTransaction().begin();
			entityManager.persist(estabelecimento);
			entityManager.getTransaction().commit();
			entityManager.flush();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			return "Problema ao adicionar estabelecimento";
		}
		return "Estabelecimento Modificado";
	}

}
