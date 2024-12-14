package com.edu.espe.examen.registro.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "REG_SESION")

public class RegistroSesion {

    @NotNull
    @Column (name = "SECUENCIA", length = 16, nullable = false)
    private String secuencia;

    @NotNull
    @Column (name = "COD_USUARIO", length = 16, nullable = false)
    private String codUsuario;

    @NotNull
    @Column (name = "FECHA_CONEXION", length = 16, nullable = false)
    private String fechaConexion;

    @NotNull
    @Column (name = "IP_CONEXION", length = 16, nullable = false)
    private String ipConexion;

    @NotNull
    @Column (name = "RESULTADO", length = 16, nullable = false)
    private String resultado;

    @NotNull
    @Column (name = "COD_ERROR", length = 16, nullable = false)
    private String codError;

    
    public RegistroSesion() {
    }

    public RegistroSesion(@NotNull String secuencia) {
        this.secuencia = secuencia;
    }

    public String getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(String secuencia) {
        this.secuencia = secuencia;
    }

    public String getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getFechaConexion() {
        return fechaConexion;
    }

    public void setFechaConexion(String fechaConexion) {
        this.fechaConexion = fechaConexion;
    }

    public String getIpConexion() {
        return ipConexion;
    }

    public void setIpConexion(String ipConexion) {
        this.ipConexion = ipConexion;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getCodError() {
        return codError;
    }

    public void setCodError(String codError) {
        this.codError = codError;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((secuencia == null) ? 0 : secuencia.hashCode());
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
        RegistroSesion other = (RegistroSesion) obj;
        if (secuencia == null) {
            if (other.secuencia != null)
                return false;
        } else if (!secuencia.equals(other.secuencia))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "RegistroSesion [secuencia=" + secuencia + ", codUsuario=" + codUsuario + ", fechaConexion="
                + fechaConexion + ", ipConexion=" + ipConexion + ", resultado=" + resultado + ", codError=" + codError
                + "]";
    }

}
