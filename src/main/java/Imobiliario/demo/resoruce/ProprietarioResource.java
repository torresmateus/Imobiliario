package Imobiliario.demo.resoruce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Imobiliario.demo.models.Proprietario;
import Imobiliario.demo.repository.ProprietarioRepository;

@RestController
@RequestMapping(value="/imobiliario")
public class ProprietarioResource {

	@Autowired
	ProprietarioRepository proprietarioRepository;
	
	@GetMapping(value="/proprietarios")
	public List<Proprietario> listaProprietarios(){
		return proprietarioRepository.findAll();
	}
	
	@GetMapping(value="/proprietarios/{id}")
	public Proprietario listaProprietario(@PathVariable(value="id") long id){
		return proprietarioRepository.findById(id);
	}
}
