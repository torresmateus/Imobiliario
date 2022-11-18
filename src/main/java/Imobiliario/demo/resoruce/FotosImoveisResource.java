package Imobiliario.demo.resoruce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Imobiliario.demo.models.FotosImoveis;
import Imobiliario.demo.repository.FotosImoveisRepository;

@RestController
@RequestMapping("/imobiliario")
public class FotosImoveisResource {

	@Autowired
	FotosImoveisRepository fotosImoveisRepository;
	
	@GetMapping("/fotosimoveis")
	public List<FotosImoveis> listaFotosImoveis(){
		return fotosImoveisRepository.findAll();
	}
	
	@GetMapping("/fotosimoveis/{id}")
	public FotosImoveis listaFotoImovel(@PathVariable(value="id") long id){
		return fotosImoveisRepository.findById(id);
	}
}
