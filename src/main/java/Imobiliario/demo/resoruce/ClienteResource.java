package Imobiliario.demo.resoruce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Imobiliario.demo.models.Cliente;
import Imobiliario.demo.repository.ClienteRepository;

@RestController
@RequestMapping(value="/imobiliario")
public class ClienteResource {
	
	@Autowired
	ClienteRepository clienteRepository;

	@GetMapping("/clientes")
	public List<Cliente> listClientes(){
		return clienteRepository.findAll();
	}
	
	@GetMapping("/clientes/{id}")
	public Cliente listaCliente(@PathVariable(value="id") long id){
		return clienteRepository.findById(id);
	}
	
	@PostMapping("/cliente")
	public Cliente salvarCliente(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
}
