package Imobiliario.demo.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_endereco")
public class Endereco implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_end")
	private long Id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
	private Cliente cliente;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_regiao", referencedColumnName = "id_regiao")
	private Regiao regiao;
	
	private String logradouro;
	private String numero;
	private String CEP;
	private String complemento;
	private String bairro;
	
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Regiao getRegiao() {
		return regiao;
	}
	public void setRegiao(Regiao regiao) {
		this.regiao = regiao;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String cEP) {
		CEP = cEP;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
}
