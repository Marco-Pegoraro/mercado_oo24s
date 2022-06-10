package br.edu.utfpr.supermercado_oo24s.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProdutosVenda {

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    private Venda venda;

    @ManyToOne
    @Getter
    private Produto produto;

    @Getter
    private Integer quantidade;

}
