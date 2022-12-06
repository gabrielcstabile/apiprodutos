package br.com.apiprodutos.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nomeProduto;

    @Column
    private BigDecimal valorProduto;

    @Column
    private String descricao;
}