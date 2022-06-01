package br.edu.utfpr.supermercado_oo24s.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProdutosVenda {

    @Id
    @GeneratedValue
    public Integer id;

    @ManyToOne
    public Venda venda;

    @ManyToOne
    public Produto produto;

    public Integer quantidade;

}
