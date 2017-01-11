package com.lux.authentication.util;

import com.lux.authentication.model.Usuario;

public class KeyUtil {

    public static String generadorDeLlaveMapa(Usuario usuario) {
        return new StringBuilder()
                .append(usuario.getUsuario())
                .append(usuario.getSucursal())
                .append(usuario.getPassword()).toString();
    }
}
