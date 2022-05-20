package br.edu.utfpr.supermercado_oo24s.model;

import javax.persistence.*;

@Entity
public class Estoque {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;

    @OneToOne
    public Produto produto;

    public String descricao;
    public Integer quantidade;
}