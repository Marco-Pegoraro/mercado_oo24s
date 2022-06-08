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
@Getter
public class Caixa {

    @Id
    public Integer id;
    public String nomeCaixa;
    public Double valorTotalCaixa;
    public Instant dataInicio;
    public Instant dataFim;

    @OneToMany
    public List<Venda> venda;

}
