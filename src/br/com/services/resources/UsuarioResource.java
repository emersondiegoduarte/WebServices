package br.com.services.resources;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.services.business.UsuarioBusiness;
import br.com.services.model.Usuario;

@Path("/usuario")
public class UsuarioResource {

	@Inject
	private UsuarioBusiness usuarioBusiness;

	@GET
	@Produces("application/json")
	public List<Usuario> getListaUsuarios() {
		return usuarioBusiness.getListaUsuarios();
	}

}
