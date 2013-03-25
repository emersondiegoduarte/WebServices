package br.com.services.business;

import java.util.List;

import javax.inject.Inject;

import br.com.services.dao.EstabelecimetoDaoImpl;
import br.com.services.model.Estabelecimento;

public class EstabelecimentoBusinessImpl implements
		EstabelecimentoBusinessInterface {

	@Inject
	private EstabelecimetoDaoImpl estabelecimentoDAO;

	

	@Override
	public List<Estabelecimento> getEstabelecimentos() {
		return estabelecimentoDAO.getEstabelecimentos();
	}

	@Override
	public Estabelecimento getEstabelecimentoPorId(int id) {
		return estabelecimentoDAO.getEstabelecimentoPorId(id);
	}

	@Override
	public String adicionarEstabelecimento(Estabelecimento estabelecimento) {
		return estabelecimentoDAO.adicionarEstabelecimento(estabelecimento);
	}

	@Override
	public String atualizarEstabelecimento(Estabelecimento estabelecimento) {
		return estabelecimentoDAO.atualizarEstabelecimento(estabelecimento);
	}

}
