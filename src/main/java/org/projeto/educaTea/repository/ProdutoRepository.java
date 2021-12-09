package org.projeto.educaTea.repository;

import java.util.List;


import org.projeto.educaTea.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Método utilizado para procurar pelo nome do produto. 
 * 
 * @param String nomeProduto
 * @return List<Produto>
 * @author Bianca Rocha
 * @version 1.0
 * @see Produto
 */
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public List<Produto> findAllByNomeProdutoContainingIgnoreCase(String nomeProduto);
	

}
