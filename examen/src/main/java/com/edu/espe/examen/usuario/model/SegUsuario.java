package com.edu.espe.examen.usuario.model;

import jakarta.validation.constraints.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "SEG_USUARIO")

public class SegUsuario {

    @Id
    @Column(name = "COD_USUARIO", length = 30, nullable = false)
    private String cod;

    @NotNull
    @Column(name = "COD_PERFIL", length = 8, nullable = false)
    private String codPerfil;

    @NotNull
    @Column(name = "MAIL", length = 128, nullable = false)
    private String mail;

    @NotNull
    @Column(name = "NOMBRE", length = 128, nullable = false)
    private String nombre;
    
    @NotNull
    @Column(name = "TELEFONO", length = 10, nullable = false)
    private String telefono;

    @NotNull
    @Column(name = "CLAVE", length = 64, nullable = false)
    private String clave;

    @NotNull
    @Column(name = "ESTADO", length = 3, nullable = false)
    private String estado;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_CREACION", nullable = false)
    private String fechaCreacion;

    @NotNull
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_CAMBIO_CLAVE", nullable = false)
    private String fechaCambioClave;

    @NotNull
    @Column(name = "NRO_INTENTOS_FALLIDOS", length = 3, nullable = false)
    private String nroIntentosFallidos;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_ULTIMA_SESION", nullable = false)
    private String fechaUltimaSesion;

    @NotNull
    @Column(name = "SUELDO", precision = 10, scale = 2, nullable = false)
    private String sueldo;


    public SegUsuario() {
    }

    public SegUsuario(String cod) {
        this.cod = cod;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getCodPerfil() {
        return codPerfil;
    }

    public void setCodPerfil(String codPerfil) {
        this.codPerfil = codPerfil;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getFechaCambioClave() {
        return fechaCambioClave;
    }

    public void setFechaCambioClave(String fechaCambioClave) {
        this.fechaCambioClave = fechaCambioClave;
    }

    public String getNroIntentosFallidos() {
        return nroIntentosFallidos;
    }

    public void setNroIntentosFallidos(String nroIntentosFallidos) {
        this.nroIntentosFallidos = nroIntentosFallidos;
    }

    public String getFechaUltimaSesion() {
        return fechaUltimaSesion;
    }

    public void setFechaUltimaSesion(String fechaUltimaSesion) {
        this.fechaUltimaSesion = fechaUltimaSesion;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
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
        SegUsuario other = (SegUsuario) obj;
        if (cod == null) {
            if (other.cod != null)
                return false;
        } else if (!cod.equals(other.cod))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SegUsuario [cod=" + cod + ", codPerfil=" + codPerfil + ", mail=" + mail + ", nombre=" + nombre
                + ", telefono=" + telefono + ", clave=" + clave + ", estado=" + estado + ", fechaCreacion="
                + fechaCreacion + ", fechaCambioClave=" + fechaCambioClave + ", nroIntentosFallidos="
                + nroIntentosFallidos + ", fechaUltimaSesion=" + fechaUltimaSesion + ", sueldo=" + sueldo + "]";
    }


}
