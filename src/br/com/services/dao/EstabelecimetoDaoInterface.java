package br.com.services.dao;

import java.util.List;

import br.com.services.model.Estabelecimento;

public interface EstabelecimetoDaoInterface {
	
	public List<Estabelecimento> getEstabelecimentos();
	
	public Estabelecimento getEstabelecimentoPorId(int id);
	
	public String adicionarEstabelecimento(Estabelecimento estabelecimento);
	
	public String atualizarEstabelecimento(Estabelecimento estabelecimento);

}
