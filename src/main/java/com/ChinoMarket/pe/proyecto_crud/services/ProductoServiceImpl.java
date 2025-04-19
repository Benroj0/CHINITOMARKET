package com.ChinoMarket.pe.proyecto_crud.services;
import com.ChinoMarket.pe.proyecto_crud.entities.Producto;
import com.ChinoMarket.pe.proyecto_crud.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ProductoServiceImpl {
    @Autowired
    private ProductoRepository productoRepository;

    public Producto crearProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    public List<Producto> obtenerTodosLosProductos() {
        return productoRepository.findAll();
    }

    public Producto obtenerProductoPorId(Long id) {
        return productoRepository.findById(id).orElse(null);
    }

    public Producto obtenerProductoPorNombre(String nombre) {
        return productoRepository.findByNombre(nombre);
    }

    public void eliminarProducto(Long id) {
        productoRepository.deleteById(id);}

}
