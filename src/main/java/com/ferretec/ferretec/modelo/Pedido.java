package com.ferretec.ferretec.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.calculators.*;

import lombok.*;

@Entity
@Getter @Setter
@View(members = "id, fecha, cliente, productos {productos}")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Required
    @DefaultValueCalculator(CurrentDateCalculator.class)
    private Date fecha;

    @ManyToOne
    @DescriptionsList
    private Cliente cliente;

    @ManyToMany
    @JoinTable(
        name = "pedido_producto",
        joinColumns = @JoinColumn(name = "pedido_id"),
        inverseJoinColumns = @JoinColumn(name = "producto_id")
    )
    @ListProperties("id, nombre, precioBase, cantidadDisponible")
    private List<Producto> productos;
}
