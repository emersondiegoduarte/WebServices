package br.com.services.business;

import java.util.List;

import javax.inject.Inject;

import br.com.services.dao.UsuarioDaoImpl;
import br.com.services.model.Usuario;

public class UsuarioBusiness {
	
	@Inject
	private UsuarioDaoImpl usuarioDaoImpl;

	public List<Usuario> getListaUsuarios() {
		// TODO Auto-generated method stub
		return usuarioDaoImpl.getListaUsuarios();
	}
	
	public Usuario getUsuarioPorId(int id) {
		return usuarioDaoImpl.getUsuarioPorId(id);
	}

	
	public String adicionarUsuario(Usuario usuario) {
		return null;
		// TODO Auto-generated method stub
		
	}

	public String atualizarUsuario(Usuario usuario) {
		return null;
		// TODO Auto-generated method stub
		
	}

	

}
