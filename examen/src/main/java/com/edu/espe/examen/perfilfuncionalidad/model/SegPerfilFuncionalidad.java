package com.edu.espe.examen.perfilfuncionalidad.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;


@Entity
@Table(name = "SEG_PERFIL_FUNCIONALIDAD")
public class SegPerfilFuncionalidad implements Serializable{

    @EmbeddedId
    private PerfilFuncionalidadPK pk;

    @NotNull
    @Column(name = "ORDEN", length = 2, nullable = false)
    private Integer orden;

    @NotNull
    @Column(name = "ESTADO", length = 3, nullable = false)
    private String estado;

    @NotNull
    @Column(name = "ADMITE_CREACION", nullable = false)
    private Boolean admiteCreacion;

    @NotNull
    @Column(name = "ADMITE_MODIFICACION", nullable = false)
    private Boolean admiteModificacion;
    

    public SegPerfilFuncionalidad(PerfilFuncionalidadPK pk) {
        this.pk = pk;
    }

    public PerfilFuncionalidadPK getPk() {
        return pk;
    }

    public void setPk(PerfilFuncionalidadPK pk) {
        this.pk = pk;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Boolean getAdmiteCreacion() {
        return admiteCreacion;
    }

    public void setAdmiteCreacion(Boolean admiteCreacion) {
        this.admiteCreacion = admiteCreacion;
    }

    public Boolean getAdmiteModificacion() {
        return admiteModificacion;
    }

    public void setAdmiteModificacion(Boolean admiteModificacion) {
        this.admiteModificacion = admiteModificacion;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((pk == null) ? 0 : pk.hashCode());
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
        SegPerfilFuncionalidad other = (SegPerfilFuncionalidad) obj;
        if (pk == null) {
            if (other.pk != null)
                return false;
        } else if (!pk.equals(other.pk))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SegPerfilFuncionalidad [pk=" + pk + ", orden=" + orden + ", estado=" + estado + ", admiteCreacion="
                + admiteCreacion + ", admiteModificacion=" + admiteModificacion + "]";
    }

}
