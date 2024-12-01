package com.ferretec.ferretec.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
@View(members = "id, nombre, descripcion, tipoVenta, precioBase, margenGanancia, codigoBarras, proveedor, cantidadDisponible")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(length = 50) @Required
    private String nombre;

    @Column(length = 255)
    private String descripcion;

    @Enumerated(EnumType.STRING) @Required
    private TipoVenta tipoVenta;

    @Required
    private double precioBase;

    private double margenGanancia;

    @Column(length = 13)
    private String codigoBarras;

    @Column(length = 50)
    private String proveedor;

    private int cantidadDisponible;
    
    @ManyToOne
    private Inventario inventario;
}
