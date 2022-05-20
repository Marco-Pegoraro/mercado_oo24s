package br.edu.utfpr.supermercado_oo24s.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
public class Caixa {

    @Id
    public Integer id;
    public String nomeCaixa;
    public Double valorTotalCaixa;
    public Date data;

    @OneToMany
    public List<Venda> venda;

}
