package br.edu.utfpr.supermercado_oo24s.model;

import br.edu.utfpr.supermercado_oo24s.model.enums.TipoMovimento;
import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ControleEstoque {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    private Produto produto;

    private Integer quantidadeMovimento;
    private TipoMovimento tipoMovimento;
}
