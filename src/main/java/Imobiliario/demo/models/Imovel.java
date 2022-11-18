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
@Table(name="tb_imovel")
public class Imovel implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_imov")
	private long id;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dt_cadastrado;
	
	private Integer quartos;
	private Integer banheiros;
	private Integer vagas;
	
	@Column(name="area_total")
	private Integer areaTotal;
	
	@Column(name="area_constr")
	private Integer areaConstruida;
	
	@Column(name="valor_iptu")
	private Double valorIptu;
	
	@Column(name="valor_cond")
	private Double valorCondominio;
	
	@Column(name="valor_imov")
	private Double valorImovel;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="tb_galeria_id_galeria", referencedColumnName = "id_galeria")
	Galeria galeria;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="tb_cat_imovel_id_catimov", referencedColumnName = "id_catimov")
	CategoriaImovel categoriaImovel;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="tb_regiao_id_regiao", referencedColumnName = "id_regiao")
	Regiao regiao;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="tb_prop_id_prop",referencedColumnName = "id_prop")
	Proprietario proprietario;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="tb_endereco_id_end",referencedColumnName = "id_end")
	Endereco endereco;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDt_cadastrado() {
		return dt_cadastrado;
	}

	public void setDt_cadastrado(Date dt_cadastrado) {
		this.dt_cadastrado = dt_cadastrado;
	}

	public Integer getQuartos() {
		return quartos;
	}

	public void setQuartos(Integer quartos) {
		this.quartos = quartos;
	}

	public Integer getBanheiros() {
		return banheiros;
	}

	public void setBanheiros(Integer banheiros) {
		this.banheiros = banheiros;
	}

	public Integer getVagas() {
		return vagas;
	}

	public void setVagas(Integer vagas) {
		this.vagas = vagas;
	}

	public Integer getAreaTotal() {
		return areaTotal;
	}

	public void setAreaTotal(Integer areaTotal) {
		this.areaTotal = areaTotal;
	}

	public Integer getAreaConstruida() {
		return areaConstruida;
	}

	public void setAreaConstruida(Integer areaConstruida) {
		this.areaConstruida = areaConstruida;
	}

	public Double getValorIptu() {
		return valorIptu;
	}

	public void setValorIptu(Double valorIptu) {
		this.valorIptu = valorIptu;
	}

	public Double getValorCondominio() {
		return valorCondominio;
	}

	public void setValorCondominio(Double valorCondominio) {
		this.valorCondominio = valorCondominio;
	}

	public Double getValorImovel() {
		return valorImovel;
	}

	public void setValorImovel(Double valorImovel) {
		this.valorImovel = valorImovel;
	}

	public Galeria getGaleria() {
		return galeria;
	}

	public void setGaleria(Galeria galeria) {
		this.galeria = galeria;
	}

	public CategoriaImovel getCategoriaImovel() {
		return categoriaImovel;
	}

	public void setCategoriaImovel(CategoriaImovel categoriaImovel) {
		this.categoriaImovel = categoriaImovel;
	}

	public Regiao getRegiao() {
		return regiao;
	}

	public void setRegiao(Regiao regiao) {
		this.regiao = regiao;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
