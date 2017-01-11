package com.lux.authentication.model;

import com.lux.authentication.util.EstatusUtil;

public class Estatus {

    private Integer codigo;
    private String descripcion;

    public Estatus() { }

    public Estatus(Integer codigo) {
        this.codigo = EstatusUtil.obtenerEstatusDeCodigo(codigo).getCodigo();
        this.descripcion = EstatusUtil.obtenerEstatusDeCodigo(codigo).getDescripcion();
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
