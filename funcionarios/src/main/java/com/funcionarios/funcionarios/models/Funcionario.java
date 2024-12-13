package com.funcionarios.funcionarios.models;

import jakarta.persistence.*;
import lombok.*;
import com.funcionarios.funcionarios.models.Enums.Profissao;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "funcionario")
public class Funcionario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_funcionario")
    private int id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "endereco")
    private String endereco;

    
    @Column(name = "salario")
    private double salario;

    @Column(name = "profissao")
    @Enumerated(EnumType.STRING)
    private Profissao profissao;
    
}
