package com.ferretec.ferretec.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
@View(members = "id, tipo, fechaInicio, fechaFin")
public class Reporte {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(length = 30) @Required
    private String tipo;

    private Date fechaInicio;

    private Date fechaFin;
}
