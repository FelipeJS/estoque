package br.com.meutrabalho.estoque.estoque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstoqueService {

	@Autowired
	private EstoqueRepository estoqueRepository;

	public Iterable<Estoque> findAll() {
		return estoqueRepository.findAll();
	}
}