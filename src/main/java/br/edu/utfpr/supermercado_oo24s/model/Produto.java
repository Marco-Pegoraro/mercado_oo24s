package br.edu.utfpr.supermercado_oo24s.model;

import br.edu.utfpr.supermercado_oo24s.model.enums.TipoMovimento;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;

    public String nome;
    public String descricao;
    public Double valor;
    public Integer quantidade;
    public TipoMovimento tipoMovimento;
}
