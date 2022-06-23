package br.edu.utfpr.supermercado_oo24s.service;

import br.edu.utfpr.supermercado_oo24s.model.Produto;
import br.edu.utfpr.supermercado_oo24s.model.ProdutosVenda;
import br.edu.utfpr.supermercado_oo24s.model.Venda;
import br.edu.utfpr.supermercado_oo24s.repository.VendaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public record AtividadesVenda(VendaRepository vendaRepository, ValidadorCPF validadorCPF) {

    public Venda iniciaVenda() {
        Venda venda = new Venda();
        return venda;
    }

    public void adicionarProduto(Venda venda, Produto produto, Integer quantidade, Double valorUnitario) {
        log.info("Adicionando produto na venda");
        venda.getProdutosVenda().add(ProdutosVenda.builder()
                .venda(venda)
                .produto(produto)
                .quantidade(quantidade)
                .valorUnitario(valorUnitario)
                .build());
        vendaRepository.save(venda);
        log.info("Produto adicionado");
    }

    private Double calculaTotalVenda(Venda venda) {
        log.info("Calculando total da venda");
        return venda.getProdutosVenda().stream()
                .mapToDouble(p -> p.getValorUnitario() * p.getQuantidade())
                .sum();
    }

    public void fechaVenda(Venda venda, String cpf) {
        log.info("Iniciando fechamento de venda");
        if(validadorCPF.verificaCPF(cpf) == true) {
            vendaRepository.save(
                    Venda.builder()
                            .id(venda.getId())
                            .cpf(cpf)
                            .totalCompra(calculaTotalVenda(venda))
                            .build()
            );
            log.info("Venda finalizada");
        }
        else
        {
            vendaRepository.save(
                    Venda.builder()
                            .id(venda.getId())
                            .cpf("CPF INVALIDO OU NÃO INFORMADO")
                            .totalCompra(calculaTotalVenda(venda))
                            .build()
            );
            log.info("Venda finalizada");
        }
    }

}
