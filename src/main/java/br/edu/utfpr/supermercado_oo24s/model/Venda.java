package br.edu.utfpr.supermercado_oo24s.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class Venda {

    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String cpf;

    @Getter
    private Double totalCompra;

    @OneToMany(mappedBy = "produto")
    @Getter
    private List<ProdutosVenda> produtosVenda;
}
