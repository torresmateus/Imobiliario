package Imobiliario.demo.resoruce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Imobiliario.demo.models.Corretor;
import Imobiliario.demo.repository.CorretorRepository;

@RestController
@RequestMapping(value="/imobiliario")
public class CorretorResource {

	@Autowired
	CorretorRepository corretorRepository;
	
	@GetMapping(value="/corretores")
	public List<Corretor> listaCorretores(){
		return corretorRepository.findAll();
	}
	
	@GetMapping(value="/corretores/{id}")
	public Corretor listaCorretor(@PathVariable(value="id") long id){
		return corretorRepository.findById(id);
	}
}
