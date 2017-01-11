package com.lux.authentication.exception;

import com.lux.authentication.model.Estatus;
import com.lux.authentication.util.EstatusUtil;

public class ServiceException extends Exception {

    private Estatus estatus;
    private String error;

    public ServiceException(Integer codigo) {
        super();
        this.estatus = EstatusUtil.obtenerEstatusDeCodigo(codigo);
        this.error = this.estatus.getDescripcion();
    }

    public ServiceException(Integer codigo, String error) {
        super();
        this.estatus = EstatusUtil.obtenerEstatusDeCodigo(codigo);
        this.error = error;
    }

    public Estatus getEstatus() {
        return estatus;
    }

    public String getError() {
        return error;
    }
}
