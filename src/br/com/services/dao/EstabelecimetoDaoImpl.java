package br.com.services.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.services.model.Estabelecimento;

public class EstabelecimetoDaoImpl  {
	
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
		// TODO Auto-generated method stub
		return null;
	}

	
	public String adicionarEstabelecimento(Estabelecimento estabelecimento) {
		return null;
		// TODO Auto-generated method stub
		
	}

	public String atualizarEstabelecimento(Estabelecimento estabelecimento) {
		return null;
		// TODO Auto-generated method stub
		
	}

}
