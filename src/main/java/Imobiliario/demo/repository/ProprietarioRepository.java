package Imobiliario.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Imobiliario.demo.models.Proprietario;

public interface ProprietarioRepository extends JpaRepository<Proprietario, Long>{

	Proprietario findById(long id);
}
