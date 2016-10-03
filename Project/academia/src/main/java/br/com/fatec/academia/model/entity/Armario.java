package br.com.fatec.academia.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "ARM_ARMARIO")
public class Armario {

	@Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ARM_ID")
	private Integer id;
	
	@Column(name = "ARM_FILEIRA")
	private String fileira;
	
	@Column(name = "ARM_COLUNA")
	private String coluna;
	
	@Column(name = "ARM_CORREDOR")
	private String corredor;
	
	
	public Armario(){
		
	}
	
	public Armario(String fileira, String coluna, String corredor) {
		this.fileira = fileira;
		this.coluna = coluna;
		this.corredor = corredor;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
