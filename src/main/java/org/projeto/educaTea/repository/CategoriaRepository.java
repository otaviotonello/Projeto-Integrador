package org.projeto.educaTea.repository;

import java.util.List;

import org.projeto.educaTea.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @param String
 * @return List<Categoria>
 * @author Pedro Borelli
 * @version 1.0
 * @see Categoria
 * @see ProdutoRepository 
 * @see UsuarioRepository
 */
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Long> {
	public List<Categoria> findAllByNomeContainingIgnoreCase(String nome);
}
