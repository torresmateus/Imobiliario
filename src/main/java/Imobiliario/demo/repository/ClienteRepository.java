package Imobiliario.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Imobiliario.demo.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
	Cliente findById(long id);
}
