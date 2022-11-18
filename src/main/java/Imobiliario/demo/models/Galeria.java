package Imobiliario.demo.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_galeria")
public class Galeria implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_galeria")
	private long id;
	
	@Column(name="nome_gal")
	private String nomeGaleria;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeGaleria() {
		return nomeGaleria;
	}

	public void setNomeGaleria(String nomeGaleria) {
		this.nomeGaleria = nomeGaleria;
	}
	
}
