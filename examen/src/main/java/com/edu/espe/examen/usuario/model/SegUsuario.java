package com.edu.espe.examen.usuario.model;

import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "SEG_USUARIO")

public class SegUsuario implements Serializable{

    @Id
    @Column(name = "COD_USUARIO", length = 30, nullable = false)
    private String codUsuario;

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
    private LocalDate fechaCreacion;

    @NotNull
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_CAMBIO_CLAVE", nullable = false)
    private LocalDate fechaCambioClave;

    @NotNull
    @Column(name = "NRO_INTENTOS_FALLIDOS", length = 3, nullable = false)
    private LocalDate nroIntentosFallidos;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_ULTIMA_SESION", nullable = false)
    private LocalDate fechaUltimaSesion;

    @NotNull
    @Column(name = "SUELDO", precision = 10, scale = 2, nullable = false)
    private BigDecimal sueldo;


    public SegUsuario() {
    }

    public SegUsuario(String codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getCod() {
        return codUsuario;
    }

    public void setCod(String cod) {
        this.codUsuario = cod;
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

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaCambioClave() {
        return fechaCambioClave;
    }

    public void setFechaCambioClave(LocalDate fechaCambioClave) {
        this.fechaCambioClave = fechaCambioClave;
    }

    public LocalDate getNroIntentosFallidos() {
        return nroIntentosFallidos;
    }

    public void setNroIntentosFallidos(LocalDate nroIntentosFallidos) {
        this.nroIntentosFallidos = nroIntentosFallidos;
    }

    public LocalDate getFechaUltimaSesion() {
        return fechaUltimaSesion;
    }

    public void setFechaUltimaSesion(LocalDate fechaUltimaSesion) {
        this.fechaUltimaSesion = fechaUltimaSesion;
    }

    public BigDecimal getSueldo() {
        return sueldo;
    }

    public void setSueldo(BigDecimal sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codUsuario == null) ? 0 : codUsuario.hashCode());
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
        if (codUsuario == null) {
            if (other.codUsuario != null)
                return false;
        } else if (!codUsuario.equals(other.codUsuario))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SegUsuario [cod=" + codUsuario + ", codPerfil=" + codPerfil + ", mail=" + mail + ", nombre=" + nombre
                + ", telefono=" + telefono + ", clave=" + clave + ", estado=" + estado + ", fechaCreacion="
                + fechaCreacion + ", fechaCambioClave=" + fechaCambioClave + ", nroIntentosFallidos="
                + nroIntentosFallidos + ", fechaUltimaSesion=" + fechaUltimaSesion + ", sueldo=" + sueldo + "]";
    }


}
