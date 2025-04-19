package com.ChinoMarket.pe.proyecto_crud.services;

import com.ChinoMarket.pe.proyecto_crud.entities.Cliente;
import com.ChinoMarket.pe.proyecto_crud.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente create(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> readAll() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente readById(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @Override
    public Cliente update(Long id, Cliente clienteActualizado) {
        Optional<Cliente> clienteExistente = clienteRepository.findById(id);
        if (clienteExistente.isPresent()) {
            Cliente cliente = clienteExistente.get();
            cliente.setNombres(clienteActualizado.getNombres());
            cliente.setEmail(clienteActualizado.getEmail());
            cliente.setPassword(clienteActualizado.getPassword());
            cliente.setCelular(clienteActualizado.getCelular());
            cliente.setDireccion(clienteActualizado.getDireccion());
            return clienteRepository.save(cliente);
        } else {
            return null;
        }
    }

    @Override
    public void delete(Long id) {
        clienteRepository.deleteById(id);
    }

    @Override
    public Cliente findByNombres(String nombres) {
        return clienteRepository.findByNombres(nombres).orElse(null);
    }
}
