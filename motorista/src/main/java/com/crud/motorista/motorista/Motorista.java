package com.crud.motorista.motorista;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Motorista {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String identifier;

    @Column
    private String name;

    @Column
    private Integer cpf;

    @Column
    private String placa;

    @Column
    private String modelo;

    @Column
    private Double precoViagem;

    @Column
    private String status;

    @Column
    private String ocupacao;

}
