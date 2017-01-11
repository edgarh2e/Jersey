package com.lux.authentication.model;

public class Respuesta extends Estatus {

    public Usuario datosUsuario;

    public Respuesta() {
        super();
    }

    public Respuesta(Integer codigo) {
        super(codigo);
    }

    public Respuesta(Integer codigo, Usuario usuario) {
        super(codigo);
        this.datosUsuario = usuario;
    }

    public Usuario getDatosUsuario() {
        return datosUsuario;
    }

    public void setDatosUsuario(Usuario datosUsuario) {
        this.datosUsuario = datosUsuario;
    }
}
