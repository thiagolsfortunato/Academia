package br.com.fatec.academia.model;

@Entity
@Table(name = "MOD_MODALIDADE")
public class Modalidade {
	
	@Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "MOD_ID")
	private int id;
	
	@Column(name = "MOD_NOME")
	private String nome;
	
	@Column(name = "MOD_ATIVO")
	private boolean ativo;
	
	@Column(name = "MOD_DESCRICAO")
	private String descricao;
		
	private Professor professor;
	
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
