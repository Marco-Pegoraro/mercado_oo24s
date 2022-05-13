package br.edu.utfpr.supermercado_oo24s.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;

    public String cpf;
    public Double totalCompra;

    @OneToMany
    public List<Produto> produtosVenda;
}
