package com.ferretec.ferretec.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.calculators.*;

import lombok.*;

@Entity
@Getter @Setter
@View(members = "id, fecha, montoTotal, productos {productos}, cliente")
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Required
    @DefaultValueCalculator(CurrentDateCalculator.class)
    private Date fecha;

    private double montoTotal;

    @ManyToMany
    @JoinTable(
        name = "venta_producto",
        joinColumns = @JoinColumn(name = "venta_id"),
        inverseJoinColumns = @JoinColumn(name = "producto_id")
    )
    @ListProperties("id, nombre, precioBase, cantidadDisponible")
    private List<Producto> productos;

    @ManyToOne
    @DescriptionsList
    private Cliente cliente;
}
