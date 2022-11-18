package Imobiliario.demo.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="tb_contrato")
public class Contrato implements Serializable{


	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_contrato")
	private long id;
	
	@Column(name="dt_contrato")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dataContrato;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="tb_forma_pagamento_id_formapag", referencedColumnName = "id_formapag")
	FormaPagamento formaPagamento;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="tb_corretor_id_corretor", referencedColumnName = "id_corretor")
	Corretor corretor;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="tb_cliente_id_cliente", referencedColumnName = "id_cliente")
	Cliente cliente;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="tb_imovel_id_imov", referencedColumnName = "id_imov")
	Imovel imovel;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public Corretor getCorretor() {
		return corretor;
	}

	public void setCorretor(Corretor corretor) {
		this.corretor = corretor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Imovel getImovel() {
		return imovel;
	}

	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}
	
	
}
