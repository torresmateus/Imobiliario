package Imobiliario.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Imobiliario.demo.models.Corretor;

public interface CorretorRepository extends JpaRepository<Corretor, Long>{

	Corretor findById(long id);
}
