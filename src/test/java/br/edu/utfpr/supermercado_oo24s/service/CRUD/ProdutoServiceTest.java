package br.edu.utfpr.supermercado_oo24s.service.CRUD;

import br.edu.utfpr.supermercado_oo24s.model.Produto;
import br.edu.utfpr.supermercado_oo24s.repository.ControleEstoqueRepository;
import br.edu.utfpr.supermercado_oo24s.repository.EstoqueRepository;
import br.edu.utfpr.supermercado_oo24s.repository.ProdutoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class ProdutoServiceTest {

    private ProdutoService underTest;

    @Mock
    private ProdutoRepository produtoRepository;

    @Mock
    private EstoqueRepository estoqueRepository;

    @Mock
    private ControleEstoqueRepository controleEstoqueRepository;

    private EstoqueService estoqueService;

    private ControleEstoqueService controleEstoqueService;

    @BeforeEach
    void setUp() {
        controleEstoqueService = new ControleEstoqueService(controleEstoqueRepository);
        estoqueService = new EstoqueService(estoqueRepository, controleEstoqueService);
        underTest = new ProdutoService(produtoRepository, estoqueService, controleEstoqueService);
    }

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
