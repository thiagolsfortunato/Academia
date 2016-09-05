package br.com.fatec.academia.model;

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
	
	
	
}
