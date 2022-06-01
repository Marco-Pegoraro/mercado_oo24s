package br.edu.utfpr.supermercado_oo24s.service.CRUD;

import br.edu.utfpr.supermercado_oo24s.model.ControleEstoque;
import br.edu.utfpr.supermercado_oo24s.model.Estoque;
import br.edu.utfpr.supermercado_oo24s.model.Produto;
import br.edu.utfpr.supermercado_oo24s.model.ProdutosVenda;
import br.edu.utfpr.supermercado_oo24s.model.enums.TipoMovimento;
import br.edu.utfpr.supermercado_oo24s.repository.ControleEstoqueRepository;
import br.edu.utfpr.supermercado_oo24s.repository.EstoqueRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public record ControleEstoqueService(ControleEstoqueRepository controleEstoqueRepository) {

    public void controleEntrada(Produto produto, Integer quantidade) {
        controleEstoqueRepository.save(
                ControleEstoque.builder()
                        .produto(produto)
                        .quantidadeMovimento(quantidade)
                        .tipoMovimento(TipoMovimento.ENTRADA)
                        .build()
        );
    }

    public void controleSaida() {

    }

}
