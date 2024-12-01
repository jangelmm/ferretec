package com.ferretec.ferretec.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
@View(members = "id, nombre, rol")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(length = 50) @Required
    private String nombre;

    @Column(length = 30)
    private String rol;
}
