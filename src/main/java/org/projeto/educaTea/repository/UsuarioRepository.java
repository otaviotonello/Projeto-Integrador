package org.projeto.educaTea.repository;


import java.util.Optional;

import org.projeto.educaTea.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @param String

 * @return List<Usuario>
 * @author Bruna Bergami
 * @version 1.0
 * @see CategoriaRepository
 * @see ProdutoRepository 
 * @see Usuario
 */

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
		public Optional <Usuario> findByNomeUsuario (String nomeUsuario);

}
