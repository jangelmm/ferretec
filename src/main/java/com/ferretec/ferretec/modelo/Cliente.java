package com.ferretec.ferretec.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
@View(members = "id, nombre, tipo, contacto")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(length = 50) @Required
    private String nombre;

    @Column(length = 30) @Required
    private String tipo;

    @Column(length = 50)
    private String contacto;
}
