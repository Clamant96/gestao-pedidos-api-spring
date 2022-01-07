package br.com.helpconnect.MinhaListaDePedidos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.helpconnect.MinhaListaDePedidos.model.ListaDeDesejos;
import br.com.helpconnect.MinhaListaDePedidos.model.Produto;

@Repository
public interface ListaDeDesejosRepository extends JpaRepository<ListaDeDesejos, Long> {
	
	//public List<ListaDeDesejos> findAllByProdutosContainingIgnoreCase(long id);

}
