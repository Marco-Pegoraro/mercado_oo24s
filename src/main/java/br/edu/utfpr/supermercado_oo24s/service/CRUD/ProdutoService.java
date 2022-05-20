package br.edu.utfpr.supermercado_oo24s.service.CRUD;

import br.edu.utfpr.supermercado_oo24s.model.ControleEstoque;
import br.edu.utfpr.supermercado_oo24s.model.Estoque;
import br.edu.utfpr.supermercado_oo24s.model.Produto;
import br.edu.utfpr.supermercado_oo24s.model.enums.TipoMovimento;
import br.edu.utfpr.supermercado_oo24s.repository.ControleEstoqueRepository;
import br.edu.utfpr.supermercado_oo24s.repository.EstoqueRepository;
import br.edu.utfpr.supermercado_oo24s.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public record ProdutoService(ProdutoRepository produtoRepository,
                             EstoqueRepository estoqueRepository,
                             ControleEstoqueRepository controleEstoqueRepository) {

    public void save(Produto produto, Integer quantidade, String descricao) {
        produtoRepository.saveAndFlush(produto);
        estoqueRepository.save(
                Estoque.builder()
                        .produto(produto)
                        .descricao(descricao)
                        .quantidade(quantidade)
                        .build()
        );

        controleEstoqueRepository.save(
                ControleEstoque.builder()
                        .produto(produto)
                        .quantidadeMovimento(quantidade)
                        .tipoMovimento(TipoMovimento.ENTRADA)
                        .build()
        );
    }

}
