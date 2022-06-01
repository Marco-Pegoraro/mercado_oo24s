package br.edu.utfpr.supermercado_oo24s.service;

import br.edu.utfpr.supermercado_oo24s.model.Caixa;
import br.edu.utfpr.supermercado_oo24s.model.Venda;
import lombok.extern.slf4j.Slf4j;

import java.util.InputMismatchException;

@Slf4j
public class AtividadesCaixa {

    private Double totalCaixa;

    public Caixa iniciaCaixa() {
        Caixa caixa = new Caixa();
        return caixa;
    }

    public void AcumulaTotalCaixa(Venda venda) {
        totalCaixa = venda.getTotalCompra();
        log.info("Total caixa atualizado");
    }

    public void fechaCaixa() {

    }

}
