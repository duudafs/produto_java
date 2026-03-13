package com.efs.produto.repositories;

import com.efs.produto.entity.Produto;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Entity
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}


