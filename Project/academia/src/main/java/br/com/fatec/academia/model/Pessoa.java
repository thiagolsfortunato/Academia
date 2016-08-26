package br.com.fatec.academia.model;

import java.util.Date;

@Entity
@Table(name = "PES_PESSOA")
public abstract class Pessoa {
	
	@Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "PES_ID")
	private int id;
	
	@Column(name = "PES_NOME")
	private String nome;
	@Column(name = "PES_DATA")
	private Date data;
	@Column(name = "PES_SEXO")
	private String sexo;
	
	public int getId() {
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
}
