package Imobiliario.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Imobiliario.demo.models.Regiao;

public interface RegiaoRepository extends JpaRepository<Regiao, Long>{

	Regiao findById(long id);
}
