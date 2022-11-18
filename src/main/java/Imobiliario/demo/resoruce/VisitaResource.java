package Imobiliario.demo.resoruce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Imobiliario.demo.models.Visita;
import Imobiliario.demo.repository.VisitaRepository;

@RestController
@RequestMapping(value="/imobiliario")
public class VisitaResource {

	@Autowired
	VisitaRepository visitaRepository;
	
	@GetMapping(value="/visitas")
	public List<Visita> listaVisitas(){
		return visitaRepository.findAll();
	}
	
	@GetMapping(value="/visitas/{id}")
	public Visita listaVisita(@PathVariable(value="id") long id){
		return visitaRepository.findById(id);
	}
}
