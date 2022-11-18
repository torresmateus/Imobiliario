package Imobiliario.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Imobiliario.demo.models.Imovel;

public interface ImovelRepository extends JpaRepository<Imovel, Long>{

	Imovel findById(long id);
}
