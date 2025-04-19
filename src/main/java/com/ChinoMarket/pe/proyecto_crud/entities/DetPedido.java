package com.ChinoMarket.pe.proyecto_crud.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "detPedido")
public class DetPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idDP;
    private Long Cantidad;
    private Long Precio_U;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "idP", referencedColumnName = "id")
    private Long idP;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "idPRO", referencedColumnName = "id")
    private Long idPRO;

    public Long getIdDP() {
        return idDP;
    }

    public void setIdDP(Long idDP) {
        this.idDP = idDP;
    }

    public Long getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Long cantidad) {
        Cantidad = cantidad;
    }

    public Long getPrecio_U() {
        return Precio_U;
    }

    public void setPrecio_U(Long precio_U) {
        Precio_U = precio_U;
    }

    public Long getIdP() {
        return idP;
    }

    public void setIdP(Long idP) {
        this.idP = idP;
    }

    public Long getIdPRO() {
        return idPRO;
    }

    public void setIdPRO(Long idPRO) {
        this.idPRO = idPRO;
    }
}