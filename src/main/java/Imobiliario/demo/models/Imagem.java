package Imobiliario.demo.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name="tb_imagens")
public class Imagem implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_img")
	private long id;
	
	@Lob
	@Type(type = "org.hibernate.type.ImageType")
	private byte[] imagem;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public byte[] getImagem() {
		return imagem;
	}

	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}
	
	
}
