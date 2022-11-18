package Imobiliario.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Imobiliario.demo.models.Imagem;

public interface ImagemRepository extends JpaRepository<Imagem, Long>{

	Imagem findById(long id);
}
