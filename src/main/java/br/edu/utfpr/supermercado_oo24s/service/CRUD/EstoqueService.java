package br.edu.utfpr.supermercado_oo24s.service.CRUD;

import br.edu.utfpr.supermercado_oo24s.repository.EstoqueRepository;
import org.springframework.stereotype.Service;

@Service
public record EstoqueService(EstoqueRepository estoqueRepository) {
}
