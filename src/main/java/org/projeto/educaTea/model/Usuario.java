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

/**
 * <p>
 * - id: representa a coluna de id do categoria. Essa coluna é gerada automaticamente e possui AUTO_INCREMENT.
 * </p>
 * 
 * <p>
 * - nomeUsuario: representa o nome da usuario;
 * </p>
 * 
 * <p>
 * - email: representa o email do usuario;
 * </p>
 * 
 * <p>
 * - senha: representa a senha do usuario;
 * </p>
 *
 * @author Joel Moraes
 * @version 1.0
 * @see Produto
 * @see Categoria
 */
@Entity
@Table (name = "tb_usuario")
public class Usuario {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank
	@Size(min = 5, max = 100)
	private String nomeUsuario;
	
	@NotBlank
	@Size(min = 10, max = 1500)
	private String email;
	

	@NotBlank
	@Size (min = 5, max = 255)
	private String senha;
	
	@Size(max = 5000)
	private String foto;
	
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("usuario")
	private List<Produto> produto;



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	
	
	
}
