package Imobiliario.demo.resoruce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Imobiliario.demo.models.Regiao;
import Imobiliario.demo.repository.RegiaoRepository;

@RestController
@RequestMapping(value="/imobiliario")
public class RegiaoResource {
	
	@Autowired
	RegiaoRepository regiaoRepository;
	
	@GetMapping("/regioes")
	public List<Regiao> listaRegioes(){
		return regiaoRepository.findAll();
	}
	
	@GetMapping("/regioes/{id}")
	public Regiao listaRegiao(@PathVariable(value="id") long id){
		return regiaoRepository.findById(id);
	}
}
