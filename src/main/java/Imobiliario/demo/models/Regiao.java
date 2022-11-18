package Imobiliario.demo.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_regiao")
public class Regiao implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_regiao")
	private long id;
	
	private String nome_regiao;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome_regiao() {
		return nome_regiao;
	}

	public void setNome_regiao(String nome_regiao) {
		this.nome_regiao = nome_regiao;
	}

}
