package br.com.services.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.services.business.UsuarioBusiness;
import br.com.services.model.Usuario;

import com.sun.jersey.api.core.InjectParam;


@Path("/usuario")
public class UsuarioResource {
	
	@InjectParam
	private UsuarioBusiness usuarioBusiness; 
	
	@GET
	@Produces("application/json")
	public List<Usuario> getListaUsuarios(){
		return usuarioBusiness.getListaUsuarios();
	}

}
