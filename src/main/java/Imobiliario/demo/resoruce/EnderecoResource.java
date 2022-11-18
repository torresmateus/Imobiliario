package Imobiliario.demo.resoruce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Imobiliario.demo.models.Endereco;
import Imobiliario.demo.repository.EnderecoRepository;

@RestController
@RequestMapping(value="/imobiliario")
public class EnderecoResource {

	@Autowired
	EnderecoRepository enderecoRepository;
	
	@GetMapping("/enderecos")
	public List<Endereco> listaEnderecos(){
		return enderecoRepository.findAll();
	}
	
	@GetMapping("/enderecos/{id}")
	public Endereco listaEndereco(@PathVariable(value="id") long id){
		return enderecoRepository.findById(id);
	}
}
