package Imobiliario.demo.resoruce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Imobiliario.demo.models.Imovel;
import Imobiliario.demo.repository.ImovelRepository;

@RestController
@RequestMapping(value="/imobiliario")
public class ImovelResource {

	@Autowired
	ImovelRepository imovelRepository;
	
	@GetMapping(value="/imoveis")
	public List<Imovel> listaImoveis(){
		return imovelRepository.findAll();
	}
	
	@GetMapping(value="/imoveis/{id}")
	public Imovel listaImovel(@PathVariable(value="id") long id){
		return imovelRepository.findById(id);
	}
}
