package org.projeto.educaTea.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name = "tb_produto")
public class Produto {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank
	@Size(min = 5, max = 100)
	private String nome_produto;
	
	@NotBlank
	@Size(min = 10, max = 1500)
	private String descricao_produto;
	
	@NotBlank
	@Size(min = 5, max = 100)
	private String nome_instrutor;
	
	@OneToMany (mappedBy = "produto", cascade = CascadeType.ALL)
	@JsonIgnoreProperties ("produto")
	private List <Categoria> categoria;
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome_produto() {
		return nome_produto;
	}

	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}

	public String getDescricao_produto() {
		return descricao_produto;
	}

	public void setDescricao_produto(String descricao_produto) {
		this.descricao_produto = descricao_produto;
	}

	public String getNome_instrutor() {
		return nome_instrutor;
	}

	public void setNome_instrutor(String nome_instrutor) {
		this.nome_instrutor = nome_instrutor;
	}

	public List<Categoria> getCategoria() {
		return categoria;
	}

	public void setCategoria(List<Categoria> categoria) {
		this.categoria = categoria;
	}
	
}
