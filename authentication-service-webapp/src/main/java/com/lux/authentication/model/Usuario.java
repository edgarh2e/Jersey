package com.lux.authentication.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class Usuario {

    public String usuario;
    public String sucursal;
    public String password;
    public String keyCode;

    public Usuario(){

    }

    public Usuario(String usuario, String sucursal, String password, String keyCode) {
        this.usuario = usuario;
        this.sucursal = sucursal;
        this.password = password;
        this.keyCode = keyCode;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public String getSucursal() {
        return this.sucursal;
    }

    public String getKeyCode() {
        return this.keyCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public void setKeyCode(String keyCode) {
        this.keyCode = keyCode;
    }

    @Override
    public String toString() {
        return new StringBuilder("user: ").append(this.getUsuario())
                .append(" sucrsal: ").append(this.getSucursal())
                .append(" keyCode: ").append(this.getKeyCode()).toString();
    }

}
