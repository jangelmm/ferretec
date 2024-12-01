package com.ferretec.ferretec.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
@View(members = "id, balanceDiario")
public class Caja {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private double balanceDiario;
}
