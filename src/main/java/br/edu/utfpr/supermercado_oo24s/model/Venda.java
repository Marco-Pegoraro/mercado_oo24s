package br.edu.utfpr.supermercado_oo24s.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;

    public String cpf;
    public Double totalCompra;

    @OneToMany(mappedBy = "produto")
    public List<ProdutosVenda> produtosVenda;
}
