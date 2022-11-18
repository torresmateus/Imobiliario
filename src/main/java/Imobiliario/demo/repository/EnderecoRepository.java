package Imobiliario.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Imobiliario.demo.models.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long>{

	Endereco findById(long id);
}
