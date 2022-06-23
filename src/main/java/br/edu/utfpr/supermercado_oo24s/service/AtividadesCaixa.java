package br.edu.utfpr.supermercado_oo24s.service;

import br.edu.utfpr.supermercado_oo24s.model.Caixa;
import br.edu.utfpr.supermercado_oo24s.model.Venda;
import br.edu.utfpr.supermercado_oo24s.repository.CaixaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Slf4j
@Component
public class AtividadesCaixa {

    private static CaixaRepository caixaRepository;
    private Double totalCaixa;

    public Caixa iniciaCaixa(String nomeCaixa) {
        Caixa caixa = new Caixa();
        caixa.setNomeCaixa(nomeCaixa);
        caixa.setDataInicio(Instant.now());
        log.info("Caixa: " + nomeCaixa + "iniciado");
        return caixa;
    }

    public void acumulaTotalCaixa(Venda venda) {
        totalCaixa = venda.getTotalCompra();
        log.info("Total do caixa atualizado");
    }

    public void fechaCaixa(Caixa caixa) {
        caixa.setDataFim(Instant.now());
        caixa.setValorTotalCaixa(totalCaixa);
        caixaRepository.save(caixa);
        totalCaixa = 0.0;
        log.info("Caixa: " + caixa.getNomeCaixa() + " fechado com sucesso.");
    }

}
