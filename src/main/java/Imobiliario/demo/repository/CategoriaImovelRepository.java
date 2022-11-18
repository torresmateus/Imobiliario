package Imobiliario.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Imobiliario.demo.models.CategoriaImovel;

public interface CategoriaImovelRepository extends JpaRepository<CategoriaImovel, Long>{

	CategoriaImovel findById(long id);
}
