package br.edu.utfpr.supermercado_oo24s.service;

import br.edu.utfpr.supermercado_oo24s.model.Caixa;
import br.edu.utfpr.supermercado_oo24s.model.Venda;
import lombok.extern.slf4j.Slf4j;

import java.time.Instant;

@Slf4j
public class AtividadesCaixa {

    private Double totalCaixa;

    public Caixa iniciaCaixa(String nomeCaixa) {
        Caixa caixa = new Caixa();
        caixa.setNomeCaixa(nomeCaixa);
        caixa.setDataInicio(Instant.now());
        return caixa;
    }

    public void AcumulaTotalCaixa(Venda venda) {
        totalCaixa = venda.getTotalCompra();
        log.info("Total caixa atualizado");
    }

    public void fechaCaixa(Caixa caixa) {
        caixa.setDataFim(Instant.now());
        caixa.setValorTotalCaixa(totalCaixa);
        totalCaixa = 0.0;
    }

}
