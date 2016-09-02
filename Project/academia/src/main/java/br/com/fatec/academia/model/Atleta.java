package br.com.fatec.academia.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ATL_ATLETA")
public class Atleta extends Pessoa{
	
	@ManyToMany(fetch = FetchType.LAZY) @JoinTable(name = "ATM_ATLETA_MODALIDADE", 
			joinColumns = { @JoinColumn(name = "ATL_ID") }, inverseJoinColumns = 
		{ @JoinColumn(name = "MOD_ID") })
	private List<Modalidade> modalidades;
	
	@OneToOne(fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name="ARM_ID", nullable = true)
	private Armario armario;

	public Armario getArmario() {
		return armario;
	}

	public void setArmario(Armario armario) {
		this.armario = armario;
	}

	public List<Modalidade> getModalidades() {
		return modalidades;
	}

	public void setModalidades(List<Modalidade> modalidades) {
		this.modalidades = modalidades;
	}
}
