package br.edu.utfpr.supermercado_oo24s.service.CRUD;

import br.edu.utfpr.supermercado_oo24s.model.Produto;
import br.edu.utfpr.supermercado_oo24s.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public record ProdutoService(ProdutoRepository produtoRepository,
                             EstoqueService estoqueService,
                             ControleEstoqueService controleEstoqueService) {

    public void insereNovoProduto(Produto produto, Integer quantidade) {
        produtoRepository.save(produto);
        estoqueService.novoProduto(produto, quantidade);
        controleEstoqueService.controleEntrada(produto, quantidade);
    }

    public void deletaProduto() {

    }

}
