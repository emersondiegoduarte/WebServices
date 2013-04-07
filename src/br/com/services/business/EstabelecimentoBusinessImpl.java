package br.com.services.business;

import java.util.List;

import javax.inject.Inject;

import br.com.services.dao.EstabelecimetoDaoImpl;
import br.com.services.model.Estabelecimento;

public class EstabelecimentoBusinessImpl  {

	@Inject
	private EstabelecimetoDaoImpl estabelecimentoDAO = new EstabelecimetoDaoImpl();

	

	
	public List<Estabelecimento> getEstabelecimentos() {
		return estabelecimentoDAO.getEstabelecimentos();
	} 

	
	public Estabelecimento getEstabelecimentoPorId(int id) {
		return estabelecimentoDAO.getEstabelecimentoPorId(id);
	}

	
	public String adicionarEstabelecimento(Estabelecimento estabelecimento) {
		return estabelecimentoDAO.adicionarEstabelecimento(estabelecimento);
	}

	
	public String atualizarEstabelecimento(Estabelecimento estabelecimento) {
		return estabelecimentoDAO.atualizarEstabelecimento(estabelecimento);
	}

	
	

}
