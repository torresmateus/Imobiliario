package Imobiliario.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Imobiliario.demo.models.Contrato;

public interface ContratoRepository extends JpaRepository<Contrato, Long>{
	
	Contrato findById(long id);
}
