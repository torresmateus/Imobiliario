package Imobiliario.demo.resoruce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Imobiliario.demo.models.CategoriaImovel;
import Imobiliario.demo.repository.CategoriaImovelRepository;

@RestController
@RequestMapping(value="/imobiliario")
public class CategoriaImovelResource {

	@Autowired
	CategoriaImovelRepository categoriaImovelRepository;

	@GetMapping("/categorias_imovel")
	public List<CategoriaImovel> listaCategoriasImovel(){
		return categoriaImovelRepository.findAll();
	}
	
	@GetMapping("/categorias_imovel/{id}")
	public CategoriaImovel listaCategoriaImovel(@PathVariable(value="id") long id){
		return categoriaImovelRepository.findById(id);
	}
}
