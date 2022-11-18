package Imobiliario.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Imobiliario.demo.models.Galeria;

public interface GaleriaRepository extends JpaRepository<Galeria, Long>{

	Galeria findById(long id);
}
