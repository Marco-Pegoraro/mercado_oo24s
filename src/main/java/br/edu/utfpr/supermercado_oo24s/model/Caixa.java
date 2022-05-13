package br.edu.utfpr.supermercado_oo24s.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity
public class Caixa {

    @Id
    public Integer id;
    public String nomeCaixa;
    public Double valorTotalCaixa;
    public Date data;

    @OneToOne
    public Venda venda;
}
