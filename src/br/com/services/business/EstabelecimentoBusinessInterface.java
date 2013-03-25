package br.com.services.business;

import java.util.List;

import br.com.services.model.Estabelecimento;

public interface EstabelecimentoBusinessInterface {
	
	
	public List<Estabelecimento> getEstabelecimentos();
	
	public Estabelecimento getEstabelecimentoPorId( int id);
	
	public String adicionarEstabelecimento(Estabelecimento estabelecimento);
	
	public String atualizarEstabelecimento(Estabelecimento estabelecimento);

	
}
