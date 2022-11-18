package Imobiliario.demo.resoruce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Imobiliario.demo.models.Galeria;
import Imobiliario.demo.repository.GaleriaRepository;

@RestController
@RequestMapping(value="/imobiliario")
public class GaleriaResource {

	@Autowired
	GaleriaRepository galeriaRepository;
	
	@GetMapping("/galerias")
	public List<Galeria> listaGalerias(){
		return galeriaRepository.findAll();
	}
	
	@GetMapping("/galerias/{id}")
	public Galeria listaGaleria(@PathVariable(value="id") long id){
		return galeriaRepository.findById(id);
	}
}
