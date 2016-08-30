package br.com.fatec.academia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AMR_ARMARIO")
public class Armario {

	@Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "AMR_ID")
	private int id;
	
	@Column(name = "AMR_FILEIRA")
	private String fileira;
	
	@Column(name = "AMR_COLUNA")
	private String coluna;
	
	@Column(name = "AMR_CORREDOR")
	private String corredor;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFileira() {
		return fileira;
	}
	public void setFileira(String fileira) {
		this.fileira = fileira;
	}
	public String getColuna() {
		return coluna;
	}
	public void setColuna(String coluna) {
		this.coluna = coluna;
	}
	public String getCorredor() {
		return corredor;
	}
	public void setCorredor(String corredor) {
		this.corredor = corredor;
	}
}
