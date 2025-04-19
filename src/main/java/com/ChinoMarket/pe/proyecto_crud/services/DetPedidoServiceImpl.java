package com.ChinoMarket.pe.proyecto_crud.services;
import com.ChinoMarket.pe.proyecto_crud.entities.DetPedido;
import com.ChinoMarket.pe.proyecto_crud.repository.DetPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetPedidoServiceImpl {
    @Autowired
    private DetPedidoRepository detPedidoRepository;

    public DetPedido crearDetPedido(DetPedido detPedido) {
        return detPedidoRepository.save(detPedido);
    }

    public List<DetPedido> obtenerTodosLosDetPedidos() {
        return detPedidoRepository.findAll();
    }

    public List<DetPedido> obtenerDetPedidoPorPedidoId(Long pedidoId) {
        return detPedidoRepository.findByPedidoId(pedidoId);
    }

    public void eliminarDetPedido(Long id) {
        detPedidoRepository.deleteById(id);}

}
