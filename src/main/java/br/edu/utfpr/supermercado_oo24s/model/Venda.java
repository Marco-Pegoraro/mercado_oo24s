package br.edu.utfpr.supermercado_oo24s.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String cpf;

    @Getter
    private Double totalCompra;

    @OneToMany(mappedBy = "produto")
    @Getter
    private List<ProdutosVenda> produtosVenda;
}
