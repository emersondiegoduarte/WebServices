package br.com.services.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.com.services.model.Estabelecimento;

@Path("/estabelecimento")
public class EstabelecimentoResource {

	@GET
	@Produces("application/json")
	public List<Estabelecimento> getEstabelecimentos(){
		return null;
	}
	
	@GET
	@Path("{id}")
	@Produces("application/json")
	public Estabelecimento getEstabelecimentoPorId(@PathParam("id") int id) {
		return null;
	}
	
}
