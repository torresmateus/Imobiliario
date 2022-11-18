package Imobiliario.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Imobiliario.demo.models.Visita;

public interface VisitaRepository extends JpaRepository<Visita, Long>{

	Visita findById(long id);
}
