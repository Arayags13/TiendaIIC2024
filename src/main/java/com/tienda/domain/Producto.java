package com.tienda.domain;

import jakarta.persistence.*;

import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="producto")
public class Producto implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_producto")
    private long idProducto; 
    
    private String descripcion; 
    private String detalle; 
    private double precio;
    private int existencias;
    @Column(name="ruta_imagen")
    private String rutaImagen; 
    private boolean activo; 

    @ManyToOne
    @JoinColumn(name="id_categoria")     
    Categoria categoria;
  
    public Producto() {
    }

    public Producto(String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }

    public Producto(String descripcion, double precio, int existencias, String rutaImagen, boolean activo) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.existencias = existencias;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }                          
}
