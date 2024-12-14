package com.edu.espe.examen.perfil.model;

import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

import com.edu.espe.examen.modulo.model.SegModulo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "SEG_PERFIL")

public class SegPerfil implements Serializable{

    @Id
    @Column(name = "COD_PERFIL", length = 16, nullable = false)
    private String codPerfil;

    @NotNull
    @Column(name = "NOMBRE", length = 50, nullable = false)
    private String nombre;

    @NotNull
    @Column(name = "ESTADO", length = 3, nullable = false)
    private String estado;

    @ManyToOne
    @JoinColumn(name = "COD_MODULO", referencedColumnName = "COD_MODULO", insertable = false, updatable = false)
    private SegModulo segModulo;

    public SegPerfil() {
    }

    public SegPerfil(String codPerfil) {
        this.codPerfil = codPerfil;
    }

    public String getCodPerfil() {
        return codPerfil;
    }

    public void setCodPerfil(String codPerfil) {
        this.codPerfil = codPerfil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codPerfil == null) ? 0 : codPerfil.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SegPerfil other = (SegPerfil) obj;
        if (codPerfil == null) {
            if (other.codPerfil != null)
                return false;
        } else if (!codPerfil.equals(other.codPerfil))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SegPerfil [cod=" + codPerfil + ", nombre=" + nombre + ", estado=" + estado + "]";
    }

}