package br.com.helpconnect.MinhaListaDePedidos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.helpconnect.MinhaListaDePedidos.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
	public Optional<Cliente> findByUsuario(String email);
}
