package com.lux.authentication;

import com.lux.authentication.data.DatosUsuario;
import com.lux.authentication.model.Respuesta;
import com.lux.authentication.model.Usuario;
import org.junit.Test;

import static junit.framework.Assert.*;

public class DatosUsuarioTest {

    @Test
    public void testDatosUsuario() {
        DatosUsuario datosUsuario = DatosUsuario.getInstance();
        assertNotNull(datosUsuario);
    }

    @Test
    public void testEscribirYLeerDatosDeUsuario() {
        Usuario usuario = new Usuario();
        usuario.setKeyCode("098-97979-09898-09098");
        usuario.setPassword("123456");
        usuario.setSucursal("12047");
        usuario.setUsuario("1550");
        Respuesta respuesta = DatosUsuario.guardarDatos("12345",usuario);
        assertEquals("200",respuesta.getCodigo().toString());

        respuesta = DatosUsuario.validarDatos("12345");
        System.out.print(respuesta.getCodigo());
        assertEquals("200",respuesta.getCodigo().toString());
        assertEquals("098-97979-09898-09098",respuesta.getDatosUsuario().getKeyCode());
    }
}
