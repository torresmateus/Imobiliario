package Imobiliario.demo.resoruce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Imobiliario.demo.models.Contrato;
import Imobiliario.demo.repository.ContratoRepository;

@RestController
@RequestMapping(value="/imobiliario")
public class ContratoResource {
	
	@Autowired
	ContratoRepository ContratoRepository;
	
	@GetMapping("/contratos")
	public List<Contrato> listaContratos(){
		return ContratoRepository.findAll();
	}

	@GetMapping("/contratos/{id}")
	public Contrato listaContrato(@PathVariable(value="id") long id){
		return ContratoRepository.findById(id);
	}
}
