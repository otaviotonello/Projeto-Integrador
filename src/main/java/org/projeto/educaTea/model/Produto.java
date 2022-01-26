package org.projeto.educaTea.model;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
 * - nomeProduto: representa o nome da produto;
 * </p>
 * 
 * <p>
 * - descricao: representa a descrição da produto;
 * </p>
 * 
 * * <p>
 * - nomeInstrutor: o atributo recebe o nome do instrutor;
 * </p>
 *
 * 
 * @author Bianca Rocha 
 * @version 1.0
 * @see Categoria 
 * @see Usuario 
 */
@Entity
@Table (name = "tb_produto")
public class Produto {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank
	@Size(min = 5, max = 100)
	private String nomeProduto;
	
	@NotBlank
	@Size(min = 10, max = 1500)
	private String descricaoProduto;
	
	@NotBlank
	@Size(min = 5, max = 100)
	private String nomeInstrutor;
	
	@ManyToOne(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
	@JoinColumn(name = "fk_categoria")
	@JsonIgnoreProperties ("produto")
	private Categoria categoria;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Usuario usuario;

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public String getNomeInstrutor() {
		return nomeInstrutor;
	}

	public void setNomeInstrutor(String nomeInstrutor) {
		this.nomeInstrutor = nomeInstrutor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
