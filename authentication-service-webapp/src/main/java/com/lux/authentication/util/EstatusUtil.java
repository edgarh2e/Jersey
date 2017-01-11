package com.lux.authentication.util;

import com.lux.authentication.model.Estatus;
import com.lux.authentication.model.CodigosEnum;

public class EstatusUtil {

    public static Estatus obtenerEstatusDeCodigo(Integer codigo) {
        Estatus estatus = new Estatus();
        for(CodigosEnum codigosEnum : CodigosEnum.values()) {
            if(codigo.equals(codigosEnum.getId())) {
                estatus.setCodigo(codigosEnum.getId());
                estatus.setDescripcion(codigosEnum.getDescripcion());
            }
        }
        return estatus;
    }

}
