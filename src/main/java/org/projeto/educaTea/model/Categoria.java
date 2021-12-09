package org.projeto.educaTea.model;

import java.util.ArrayList;
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

/**
 * <p>
 * - id: representa a coluna de id do categoria. Essa coluna é gerada automaticamente e possui AUTO_INCREMENT.
 * </p>
 * 
 * <p>
 * - nome: representa o nome da categoria;
 * </p>
 * 
 * <p>
 * - descricao: representa a descrição da categoria;
 * </p>
 * 
 * <p>
 * - ArrayList (produto): representa o relacionamento e recursividade com a tabela de produtos;
 * </p>
 * 
 * @param Model 
 * @return Atributos e Relacionamento
 * @author Otavio Tonello
 * @version 1.0
 * @see Categoria
 * 
 */

@Entity
@Table (name = "tb_categoria")
public class Categoria {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank
	@Size(min = 5, max = 100)
	private String nome;
	
	@NotBlank
	@Size(min = 10, max = 1500)
	private String descricao;
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("categoria")
	private List<Produto> produto = new ArrayList<>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

	
}
