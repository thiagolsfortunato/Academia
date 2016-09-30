package br.com.fatec.academia.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "PES_PESSOA")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pessoa {
	
	@Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "PES_ID")
	private Integer id;
	
	@Column(name = "PES_NOME")
	private String nome;
	
	@Column(name = "PES_DATA")
	private Date data;
	
	@Column(name = "PES_SEXO")
	private String sexo;
	
	public Pessoa(){
		
	}
	
	public Pessoa(String nome, Date data, String sexo) {
		this.nome = nome;
		this.data = data;
		this.sexo = sexo;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public abstract void addModalidade(Modalidade m);
}
