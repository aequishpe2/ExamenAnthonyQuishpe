package com.edu.espe.examen.usuario.model;

import jakarta.validation.constraints.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SEG_USUARIO")

public class SegUsuario {

    @Id
    @Column(name = "COD_USUARIO", length = 16, nullable = false)
    private String cod;

    @NotNull
    @Column(name = "NOMBRE", length = 50, nullable = false)

}
