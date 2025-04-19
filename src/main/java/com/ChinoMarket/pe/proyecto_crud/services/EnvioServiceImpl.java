package com.ChinoMarket.pe.proyecto_crud.services;

import com.ChinoMarket.pe.proyecto_crud.entities.Envio;
import com.ChinoMarket.pe.proyecto_crud.repository.EnvioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class EnvioServiceImpl {

    @Autowired
    private EnvioRepository envioRepository;

    public Envio crearEnvio(Envio envio) {
        return envioRepository.save(envio);
    }

    public List<Envio> obtenerTodosLosEnvios() {
        return envioRepository.findAll();
    }

    public List<Envio> obtenerEnviosPorClienteId(Long clienteId) {
        return envioRepository.findByClienteId(clienteId);
    }

    public void eliminarEnvio(Long id) {
        envioRepository.deleteById(id);}

}
