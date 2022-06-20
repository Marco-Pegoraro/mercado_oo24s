package br.edu.utfpr.supermercado_oo24s.service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ValidadorCPFTest {

    private ValidadorCPF underTest;

    @Test
    void testaCPFInvalido() {
        //given
        String cpf = "11111111111";

        //when
        var result = underTest.verificaCPF(cpf);

        //then
        assertThat(result).isEqualTo(false);
    }

    @Test
    void testaCPFValido() {
        //given
        String cpf = "11350616966";

        //when
        var result = underTest.verificaCPF(cpf);

        //then
        assertThat(result).isEqualTo(true);
    }
}
