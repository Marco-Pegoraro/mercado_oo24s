package br.edu.utfpr.supermercado_oo24s.service.CRUD;

import br.edu.utfpr.supermercado_oo24s.model.Produto;
import br.edu.utfpr.supermercado_oo24s.repository.ProdutoRepository;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.verify;

public class ProdutoServiceTest {

    private ProdutoService underTest;

    @Mock
    private ProdutoRepository produtoRepository;

    @Test
    void testaInsereNovoProduto() {
        //given
        Produto produto = Produto.builder()
                .nome("Suco")
                .valor(5.00)
                .build();

        ArgumentCaptor<Produto> produtoArgumentCaptor =
                ArgumentCaptor.forClass(Produto.class);

        Integer quantidade = 15;

        //when
        underTest.insereNovoProduto(produto, quantidade);

        //then
        verify(produtoRepository).save(produtoArgumentCaptor.capture());

        Produto captured = produtoArgumentCaptor.getValue();

        assertThat(captured).isEqualTo(produto);
    }
}
