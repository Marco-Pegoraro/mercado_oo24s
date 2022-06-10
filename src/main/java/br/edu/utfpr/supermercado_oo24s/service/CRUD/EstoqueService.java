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
public record EstoqueService(EstoqueRepository estoqueRepository, ControleEstoqueService controleEstoqueService) {

    public void novoProduto(Produto produto, Integer quantidade) {
        log.info("Inserindo" + produto.getNome());
        estoqueRepository.save(
                Estoque.builder()
                        .produto(produto)
                        .quantidade(quantidade)
                        .build()
        );
        log.info("Produto cadastrado");
    }

    public void atualizaEstoque(List<ProdutosVenda> produtos) {
        log.info("Iniciando atualização de estoque");
        produtos.stream()
                        .map(produtosVenda -> Estoque.builder()
                                .produto(produtosVenda.getProduto())
                                .quantidade(produtosVenda.getQuantidade())
                                .build())
                .forEach(estoqueRepository::save);
        log.info("Atualização do estoque finalizada");
    }

    public void devolucaoProduto(Produto produto, Integer quantidade) {
        log.info("Iniciando devolução do produto - " + produto.getNome());
        estoqueRepository.saveAndFlush(
                Estoque.builder()
                        .id(produto.getId())
                        .produto(produto)
                        .quantidade(quantidade)
                        .build()
        );
        controleEstoqueService.controleEntrada(produto, quantidade);
        log.info(produto.getNome() + " devolvido(a) com sucesso");
    }
}
