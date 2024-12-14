package com.edu.espe.examen.modulo.model;

import java.io.Serializable;

import jakarta.validation.constraints.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SEG_MODULO")
public class SegModulo implements Serializable {

    @Id
    @Column(name = "COD_MODULO", length = 16, nullable = false)
    private String codModulo;
    @NotNull
    @Column(name = "NOMBRE", length = 50, nullable = false)
    private String nombre;
    @NotNull
    @Column(name = "VERSION", length = 3, nullable = false)
    private String version;

    public SegModulo() {
    }

    public SegModulo(String codModulo) {
        this.codModulo = codModulo;
    }

    public String getCodModulo() {
        return codModulo;
    }

    public void setCodModulo(String codModulo) {
        this.codModulo = codModulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codModulo == null) ? 0 : codModulo.hashCode());
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
        SegModulo other = (SegModulo) obj;
        if (codModulo == null) {
            if (other.codModulo != null)
                return false;
        } else if (!codModulo.equals(other.codModulo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SegModulo [cod=" + codModulo + ", nombre=" + nombre + ", version=" + version + "]";
    }

}
