package br.edu.utfpr.supermercado_oo24s.service;

import br.edu.utfpr.supermercado_oo24s.model.ProdutosVenda;
import br.edu.utfpr.supermercado_oo24s.model.Venda;

public class AtividadesVenda {

    public Venda iniciaVenda() {
        Venda venda = new Venda();
        return venda;
    }

    public void adicionarProduto(Venda venda, ProdutosVenda produtoVenda) {
        venda.produtosVenda.add(produtoVenda);
    }

    public void calculaTotalVenda(Venda venda) {

    }

    private void criaProdutosVenda() {

    }

    private void adicionaProdutosVenda() {

    }

    public void fechaVenda() {

    }

}
