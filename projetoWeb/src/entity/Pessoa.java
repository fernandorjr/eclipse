package entity;

import java.io.Serializable;

public class Pessoa implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nome;
	private Integer idade;
	private String foto;
	
	
	public Pessoa() {
		super();
	}
	public Pessoa(Integer id, String nome, Integer idade, String foto) {
		super();
		this.id    = id;
		this.nome  = nome;
		this.idade = idade;
		this.foto  = foto;
	}
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", idade=" + idade + ", foto=" + foto + "]";
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
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	

}
