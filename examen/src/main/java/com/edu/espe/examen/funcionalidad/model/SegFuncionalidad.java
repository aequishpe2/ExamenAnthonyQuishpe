package com.edu.espe.examen.funcionalidad.model;

import jakarta.validation.constraints.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SEG_FUNCIONALIDAD")
public class SegFuncionalidad {

    @Id
    @Column(name = "COD_FUNCIONALIDAD", length = 16, nullable = false)
    private String cod;
    @NotNull
    @Column(name = "NOMBRE", length = 50, nullable = false)
    private String nombre;
    @NotNull
    @Column(name = "VERSION", length = 3, nullable = false)
    private String version;


}
