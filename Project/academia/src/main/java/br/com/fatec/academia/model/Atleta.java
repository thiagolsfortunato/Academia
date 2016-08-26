package br.com.fatec.academia.model;

import java.util.List;

@Entity
@Table(name = "ATL_ATLETA")
public class Atleta extends Pessoa{
	
	private List<Modalidade> modalidades;
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
