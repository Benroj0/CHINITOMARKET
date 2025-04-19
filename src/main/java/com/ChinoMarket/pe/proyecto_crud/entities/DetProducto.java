package com.ChinoMarket.pe.proyecto_crud.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "detProducto")
public class DetProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idA;
    private Integer entrada;
    private Integer salida;
    private String descripcion;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "idPRO", referencedColumnName = "id")
    private Long idPRO;

    public Long getIdA() {
        return idA;
    }

    public void setIdA(Long idA) {
        this.idA = idA;
    }

    public Integer getEntrada() {
        return entrada;
    }

    public void setEntrada(Integer entrada) {
        this.entrada = entrada;
    }

    public Integer getSalida() {
        return salida;
    }

    public void setSalida(Integer salida) {
        this.salida = salida;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getIdPRO() {
        return idPRO;
    }

    public void setIdPRO(Long idPRO) {
        this.idPRO = idPRO;
    }
}
