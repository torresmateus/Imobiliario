package Imobiliario.demo.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_cat_imov")
public class CategoriaImovel implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_catimov")
	private long Id;
	
	@Column(name="nome_cat")
	private String nomeCategoria;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}
	
	
}
