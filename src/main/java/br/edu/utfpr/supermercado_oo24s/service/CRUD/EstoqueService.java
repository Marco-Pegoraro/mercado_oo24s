package br.edu.utfpr.supermercado_oo24s.service.CRUD;

import br.edu.utfpr.supermercado_oo24s.model.Estoque;
import br.edu.utfpr.supermercado_oo24s.model.Produto;
import br.edu.utfpr.supermercado_oo24s.model.ProdutosVenda;
import br.edu.utfpr.supermercado_oo24s.repository.EstoqueRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public record EstoqueService(EstoqueRepository estoqueRepository) {

    public void novoProduto(Produto produto, Integer quantidade) {
        estoqueRepository.save(
                Estoque.builder()
                        .produto(produto)
                        .quantidade(quantidade)
                        .build()
        );
    }

    public void atualizaEstoque(List<ProdutosVenda> produtos) {
        log.info("Iniciando atualização de estoque");
    }

    public void devolucaoProduto(Produto produto) {

    }
}
