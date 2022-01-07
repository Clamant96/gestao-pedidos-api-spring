package br.com.helpconnect.MinhaListaDePedidos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.helpconnect.MinhaListaDePedidos.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);
	
	//public List<Produto> findByQtdPedidoProduto(int qtdPedidoProduto);
	
}
