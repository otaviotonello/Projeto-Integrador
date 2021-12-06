package org.projeto.educaTea.repository;

import java.util.List;


import org.projeto.educaTea.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public List<Produto> findAllByNomeProdutoContainingIgnoreCase(String nomeProduto);
	

}
