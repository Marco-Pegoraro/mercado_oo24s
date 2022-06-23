package br.edu.utfpr.supermercado_oo24s.service;

import br.edu.utfpr.supermercado_oo24s.model.Venda;
import br.edu.utfpr.supermercado_oo24s.repository.VendaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class AtividadesVendaTest {

    private AtividadesVenda underTest;

    @Mock
    private VendaRepository vendaRepository;

    @Mock
    private ValidadorCPF validadorCPF;

    @BeforeEach
    void setUp() {
        underTest = new AtividadesVenda(vendaRepository, validadorCPF);
    }

    @Test
    void testaInciciaVenda() {
        //when
        var result = underTest.iniciaVenda();

        //then
        assertThat(result).isExactlyInstanceOf(Venda.class);
    }

    @Test
    void testaAdicionarProduto() {
        //given


        //when


        //then
    }

    @Test
    void testaFechaVenda() {
        //given


        //when


        //then
    }
}
