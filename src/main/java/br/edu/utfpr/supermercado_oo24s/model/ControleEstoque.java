package br.edu.utfpr.supermercado_oo24s.model;

import br.edu.utfpr.supermercado_oo24s.model.enums.TipoMovimento;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@RequiredArgsConstructor
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
