package br.edu.utfpr.supermercado_oo24s.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;

    public String cpf;
    public Double totalCompra;
}
