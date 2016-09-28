package br.com.fatec.academia.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MOD_MODALIDADE")
public class Modalidade {
	
	public Modalidade(){}
	
	@Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "MOD_ID")
	private Integer id;
	
	@Column(name = "MOD_NOME")
	private String nome;
	
	@Column(name = "MOD_ATIVO")
	private boolean ativo;
	
	@Column(name = "MOD_DESCRICAO", unique = true)
	private String descricao;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = true) 
	@JoinColumn(name = "PES_ID", nullable = true)
	private Professor professor;
	
	
	public Modalidade(String nome, boolean ativo, String descricao) {
		this.nome = nome;
		this.ativo = ativo;
		this.descricao = descricao;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
}
