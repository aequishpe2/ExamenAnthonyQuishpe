package com.edu.espe.examen.modulo.perfil;

import jakarta.validation.constraints.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SEG_PERFIL")

public class SegPerfil {

    @Id
    @Column(name = "COD_PERFIL", length = 16, nullable = false)
    private String cod;

    @NotNull
    @Column(name = "NOMBRE", length = 50, nullable = false)
    private String nombre;

    @NotNull
    @Column(name = "ESTADO", length = 3, nullable = false)
    private String estado;

    public SegPerfil() {
    }

    public SegPerfil(String cod) {
        this.cod = cod;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
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
        result = prime * result + ((cod == null) ? 0 : cod.hashCode());
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
        if (cod == null) {
            if (other.cod != null)
                return false;
        } else if (!cod.equals(other.cod))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SegPerfil [cod=" + cod + ", nombre=" + nombre + ", estado=" + estado + "]";
    }

}
