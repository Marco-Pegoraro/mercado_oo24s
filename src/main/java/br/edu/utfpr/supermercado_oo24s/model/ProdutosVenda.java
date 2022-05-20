package br.edu.utfpr.supermercado_oo24s.model;

import javax.persistence.*;

@Entity
public class ProdutosVenda {

    @Id
    @GeneratedValue
    public Integer id;

    @ManyToOne
    public Venda venda;

    @ManyToOne
    public Produto produto;

}
