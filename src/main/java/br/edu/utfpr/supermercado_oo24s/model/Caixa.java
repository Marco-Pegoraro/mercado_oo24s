package br.edu.utfpr.supermercado_oo24s.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@Setter
public class Caixa {

    @Id
    private Integer id;

    @Getter
    private String nomeCaixa;
    private Double valorTotalCaixa;
    private Instant dataInicio;
    private Instant dataFim;

    @OneToMany
    private List<Venda> venda;

}
