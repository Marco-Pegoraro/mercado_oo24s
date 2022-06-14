package br.edu.utfpr.supermercado_oo24s.service;

import br.edu.utfpr.supermercado_oo24s.model.Produto;
import br.edu.utfpr.supermercado_oo24s.model.ProdutosVenda;
import br.edu.utfpr.supermercado_oo24s.model.Venda;
import br.edu.utfpr.supermercado_oo24s.repository.VendaRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public record AtividadesVenda(VendaRepository vendaRepository) {

    public Venda iniciaVenda() {
        Venda venda = new Venda();
        return venda;
    }

    public void adicionarProduto(Venda venda, Produto produto, Integer quantidade) {
        log.info("Adicionando produto na venda");
        venda.getProdutosVenda().add(ProdutosVenda.builder()
                .venda(venda)
                .produto(produto)
                .quantidade(quantidade)
                .build());
        vendaRepository.save(venda);
        log.info("Produto adicionado");
    }

    private Double calculaTotalVenda(Venda venda) {
        log.info("Calculando total da venda");
        return 10.0;
    }

    public void fechaVenda(Venda venda, String cpf) {

    }

}
