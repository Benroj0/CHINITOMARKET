package com.ChinoMarket.pe.proyecto_crud.services;
import com.ChinoMarket.pe.proyecto_crud.entities.Pedido;
import com.ChinoMarket.pe.proyecto_crud.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PedidoServiceImpl {
    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido crearPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public List<Pedido> obtenerTodosLosPedidos() {
        return pedidoRepository.findAll();
    }

    public List<Pedido> obtenerPedidosPorClienteId(Long clienteId) {
        return pedidoRepository.findByClienteId(clienteId);
    }

    public List<Pedido> obtenerPedidosPorEstado(String estado) {
        return pedidoRepository.findByEstado(estado);
    }

    public void eliminarPedido(Long id) {
        pedidoRepository.deleteById(id);}

}
