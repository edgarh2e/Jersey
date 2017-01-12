package com.lux.authentication.model;

import javax.ws.rs.core.Response;

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

    public Response generarResponse() {
        return Response.status(this.getCodigo())
                .entity(this.getDatosUsuario())
                .build();
    }
}
