package br.com.fatec.academia.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PRF_PROFESSOR")
public class Professor extends Pessoa{
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "professor")	
	private List<Modalidade> modalidades;
	
	public Professor(String nome, Date data, String sexo) {
		super(nome, data, sexo);
		modalidades = new ArrayList<>();
	}
	
	public void addModalidade(Modalidade m){
		m.setProfessor(this);
		modalidades.add(m);
	}
	

	
	
	
	
}
