package br.edu.utfpr.supermercado_oo24s.service.CRUD;

import br.edu.utfpr.supermercado_oo24s.model.Estoque;
import br.edu.utfpr.supermercado_oo24s.model.Produto;
import br.edu.utfpr.supermercado_oo24s.repository.EstoqueRepository;
import org.springframework.stereotype.Service;

@Service
public record EstoqueService(EstoqueRepository estoqueRepository) {

    public void novoProduto(Produto produto, Integer quantidade) {
        estoqueRepository.save(
                Estoque.builder()
                        .produto(produto)
                        .quantidade(quantidade)
                        .build()
        );
    }

    public void atualizaEstoque() {

    }

    public void devolucaoProduto() {

    }
}
