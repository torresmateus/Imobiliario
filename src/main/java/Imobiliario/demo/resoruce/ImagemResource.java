package Imobiliario.demo.resoruce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Imobiliario.demo.models.Imagem;
import Imobiliario.demo.repository.ImagemRepository;

@RestController
@RequestMapping(value="/imobiliario")
public class ImagemResource {

	@Autowired
	ImagemRepository imagemRepository;
	
	@GetMapping(value="/imagens")
	public List<Imagem> listaImagens(){
		return imagemRepository.findAll();
	}
	
	@GetMapping(value="/imagens/{id}")
	public Imagem listaImagem(@PathVariable(value="id") long id){
		return imagemRepository.findById(id);
	}
}
