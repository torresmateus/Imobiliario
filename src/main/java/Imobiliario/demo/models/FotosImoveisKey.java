package Imobiliario.demo.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class FotosImoveisKey implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(name="tb_galeria_id_galeria")
	long idGaleria;
	
	@Column(name="tb_imagens_id_img")
	long idImagem;

	public long getIdGaleria() {
		return idGaleria;
	}

	public void setIdGaleria(long idGaleria) {
		this.idGaleria = idGaleria;
	}

	public long getIdImagem() {
		return idImagem;
	}

	public void setIdImagem(long idImagem) {
		this.idImagem = idImagem;
	}
	
	
}
