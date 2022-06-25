package br.edu.utfpr.supermercado_oo24s.service;

import br.edu.utfpr.supermercado_oo24s.model.Caixa;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AtividadesCaixaTest {

    private AtividadesCaixa underTest;

    @BeforeEach
    void setUp() {
        underTest = new AtividadesCaixa();
    }

    @Test
    void testaIniciaCaixa() {
        //given
        String nomeCaixa = "CAIXA 001";

        //when
        var result = underTest.iniciaCaixa(nomeCaixa);

        //then
        assertThat(result)
                .isExactlyInstanceOf(Caixa.class)
                .hasFieldOrProperty("nomeCaixa")
                .extracting(Caixa::getNomeCaixa)
                .isEqualTo(nomeCaixa);
    }

    @Test
    void testaAcumulaTotalCaixa() {
        //given


        //when


        //then
    }

    @Test
    void testaFechaCaixa() {
        //given


        //when


        //then
    }
}
