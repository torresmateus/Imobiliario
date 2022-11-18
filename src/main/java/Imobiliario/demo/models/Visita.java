package Imobiliario.demo.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="tb_visita")
public class Visita implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_visita")
	private long id;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(name="dt_visita")
	private Date dataVisita;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="tb_cliente_id_cliente", referencedColumnName = "id_cliente")
	Cliente cliente;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="tb_imovel_id_imov",referencedColumnName = "id_imov")
	Imovel imovel;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="tb_corretor_id_corretor",referencedColumnName = "id_corretor")
	Corretor corretor;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDataVisita() {
		return dataVisita;
	}

	public void setDataVisita(Date dataVisita) {
		this.dataVisita = dataVisita;
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

	public Corretor getCorretor() {
		return corretor;
	}

	public void setCorretor(Corretor corretor) {
		this.corretor = corretor;
	}

	
	
}
