package org.projeto.educaTea.repository;

import java.util.List;

import org.projeto.educaTea.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @param findByNomeContainingIgnoreCase
 * @return String nome
 * @author Pedro Borelli
 * @version 1.0
 * @see CategoriaRepository
 * 
 */

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Long> {
	public List<Categoria> findAllByNomeContainingIgnoreCase(String nome);
}
