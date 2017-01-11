package com.lux.authentication;

import com.lux.authentication.model.Estatus;
import com.lux.authentication.model.Usuario;
import com.lux.authentication.util.EstatusUtil;
import com.lux.authentication.util.KeyUtil;
import org.junit.Test;

import static junit.framework.Assert.*;

public class UtilTest {

    @Test
    public void testObtenerEstatusDeCodigo() {
        Estatus estatus = EstatusUtil.obtenerEstatusDeCodigo(200);
        assertEquals("200",String.valueOf(estatus.getCodigo()));
        estatus = EstatusUtil.obtenerEstatusDeCodigo(400);
        assertEquals("400",String.valueOf(estatus.getCodigo()));
        estatus = EstatusUtil.obtenerEstatusDeCodigo(401);
        assertEquals("401",String.valueOf(estatus.getCodigo()));
        estatus = EstatusUtil.obtenerEstatusDeCodigo(500);
        assertEquals("500",String.valueOf(estatus.getCodigo()));
    }

    @Test
    public void testGeneradorDeLlaveMapa() {
        Usuario usuario = new Usuario();
        usuario.setUsuario("1550");
        usuario.setSucursal("12047");
        usuario.setPassword("123456");
        String key = KeyUtil.generadorDeLlaveMapa(usuario);
        assertEquals("155012047123456",key);
    }
}
