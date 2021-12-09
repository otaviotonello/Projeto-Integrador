package org.projeto.educaTea.repository;

import java.util.List;

import org.projeto.educaTea.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @param String
 * @return List<Usuario>
 * @author Bruna Bergami
 * @version 1.0
 * @see CategoriaRepository
 * @see ProdutoRepository 
 * @see Usuario
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	public List<Usuario> findAllByNomeUsuarioContainingIgnoreCase(String nomeUsuario);

}
