package com.tienda.service;

import com.tienda.domain.Producto;
import java.util.List;

public interface ProductoService {

    //se obtiene un listado de productos en un list - READ
    public List<Producto> getProductos(boolean activos);

    // Se obtiene un Producto, a partir del id de un producto - READ parametro
    public Producto getProducto(Producto producto);

    // Se inserta un nuevo producto si el id del producto esta vacío - CREATE
    // Se actualiza un producto si el id del producto NO esta vacío - UPDATE
    public void save(Producto producto);

    // Se elimina el producto que tiene el id pasado por parámetro
    public void delete(Producto producto);

    // Lista de productos con precio entre ordendados por descripción ConsultaAmpliada
    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);
    
    //Lista de productos utilizando consultas con JPQL    
    public List<Producto> metodoJPQL(double precioInf, double precioSup);
    
    //Lista de productos utilizando consultas con SQL Nativo
    public List<Producto> metodoNativo(double precioInf, double precioSup);
    
    //Tarea#4
    public List<Producto> findByPrecioGreaterThanEqual(double precioSupIgual);
}
