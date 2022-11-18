package Imobiliario.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Imobiliario.demo.models.FotosImoveis;

public interface FotosImoveisRepository extends JpaRepository<FotosImoveis, Long>{

	FotosImoveis findById(long id);
}
