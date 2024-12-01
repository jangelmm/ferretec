package com.ferretec.ferretec.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
@View(members = "id, productos {productos}, nivelMinimo")
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToMany(mappedBy = "inventario", cascade = CascadeType.ALL)
    @ListProperties("id, nombre, cantidadDisponible")
    private List<Producto> productos;

    private int nivelMinimo;
}
