package com.ChinoMarket.pe.proyecto_crud.services;

import com.ChinoMarket.pe.proyecto_crud.entities.Cliente;

import java.util.List;

public interface ClienteService {
    Cliente create(Cliente cliente);
    List<Cliente> readAll();
    Cliente readById(Long id);
    Cliente update(Long id, Cliente cliente);
    void delete(Long id);
    Cliente findByNombres(String nombres);
}
