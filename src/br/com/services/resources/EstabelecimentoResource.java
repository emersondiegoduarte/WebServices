package br.com.services.resources;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.com.services.business.EstabelecimentoBusinessImpl;
import br.com.services.model.Estabelecimento;

@Path("/estabelecimento")
public class EstabelecimentoResource {

	@Inject
	private EstabelecimentoBusinessImpl estabelecimentoBusiness;

	@GET
	@Produces("application/json")
	public List<Estabelecimento> getEstabelecimentos() {
		return estabelecimentoBusiness.getEstabelecimentos();
	}

	@GET
	@Path("{id}")
	@Produces("application/json")
	public Estabelecimento getEstabelecimentoPorId(@PathParam("id") int id) {
		return estabelecimentoBusiness.getEstabelecimentoPorId(id);
	}

	@POST
	@Consumes("application/json")
	@Produces("text/html")
	public String adicionarEstabelecimento(Estabelecimento estabelecimento) {
		estabelecimentoBusiness.adicionarEstabelecimento(estabelecimento);
		return "OK";
	}

	@PUT
	@Path("{id}")
	@Consumes("application/json")
	@Produces("text/html")
	public String atualizarEstabelecimento(Estabelecimento estabelecimento,
			@PathParam("id") int id) {
		estabelecimentoBusiness.atualizarEstabelecimento(estabelecimento);
		return "OK";
	}

}
