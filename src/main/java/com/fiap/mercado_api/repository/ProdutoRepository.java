package com.fiap.mercado_api.repository;

import com.fiap.mercado_api.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
