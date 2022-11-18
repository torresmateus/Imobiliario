package Imobiliario.demo.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name="tb_fts_imv")
public class FotosImoveis implements Serializable{

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_fts_img")
	private FotosImoveisKey id;
	
	@ManyToOne
	@MapsId("idGaleria")
	@JoinColumn(name = "tb_galeria_id_galeria")
	private Galeria galeria;
	
	@ManyToOne
	@MapsId("idImagem")
	@JoinColumn(name = "tb_imagens_id_img")
	private Imagem imagem;

	public FotosImoveisKey getId() {
		return id;
	}

	public void setId(FotosImoveisKey id) {
		this.id = id;
	}

	public Galeria getGaleria() {
		return galeria;
	}

	public void setGaleria(Galeria galeria) {
		this.galeria = galeria;
	}

	public Imagem getImagem() {
		return imagem;
	}

	public void setImagem(Imagem imagem) {
		this.imagem = imagem;
	}
	
	
}
