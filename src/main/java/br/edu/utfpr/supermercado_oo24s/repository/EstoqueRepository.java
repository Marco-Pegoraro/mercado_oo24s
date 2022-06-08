package br.edu.utfpr.supermercado_oo24s.repository;

import br.edu.utfpr.supermercado_oo24s.model.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

@Repository
public interface EstoqueRepository extends JpaRepository<Estoque, Id> {
}
