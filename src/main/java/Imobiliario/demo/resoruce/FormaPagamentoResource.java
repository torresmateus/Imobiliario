package Imobiliario.demo.resoruce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Imobiliario.demo.models.FormaPagamento;
import Imobiliario.demo.repository.FormaPagamentoRepository;

@RestController
@RequestMapping(value="/imobiliario")
public class FormaPagamentoResource {

	@Autowired
	FormaPagamentoRepository formaPagamentoRepository;
	
	@GetMapping("/formaspagamento")
	public List<FormaPagamento> listaFormasPagamento(){
		return formaPagamentoRepository.findAll();
	}
	
	@GetMapping("/formaspagamento/{id}")
	public FormaPagamento listaFormaPagamento(@PathVariable(value="id") long id){
		return formaPagamentoRepository.findById(id);
	}
}
