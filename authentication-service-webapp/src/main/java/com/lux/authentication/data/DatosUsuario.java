package com.lux.authentication.data;

import com.lux.authentication.exception.ServiceException;
import com.lux.authentication.model.CodigosEnum;
import com.lux.authentication.model.Respuesta;
import com.lux.authentication.model.Usuario;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class DatosUsuario implements Serializable {

    private static final long serialVersionUID = -1093810940935189395L;

    private static DatosUsuario datosUsuario = new DatosUsuario();
    private static Map<String, Usuario> mapaUsuarios = new HashMap<String, Usuario>();

    private DatosUsuario(){
        if(datosUsuario !=null){
            throw new IllegalStateException("Ya se ha creado!");
        }
    }

    public static DatosUsuario getInstance(){
        return datosUsuario;
    }

    public static Respuesta validarDatos(String llave) {
        try {
            return datosUsuario.leerDatosDeUsuario(llave);
        } catch (ServiceException serviceExcp) {
            return new Respuesta(serviceExcp.getEstatus().getCodigo());
        }
    }

    public static Respuesta guardarDatos(String llave, Usuario usuario) {
        try {
            usuario.setPassword(null);
            datosUsuario.escribirDatosDeUsuario(llave, usuario);
            return new Respuesta(CodigosEnum.CODIGO_200.getId());
        } catch (ServiceException serviceExcp) {
            return new Respuesta(serviceExcp.getEstatus().getCodigo());
        }
    }

    private Respuesta leerDatosDeUsuario(String llave) throws ServiceException {
        try{
            mapaUsuarios.get(llave).getKeyCode();
            return new Respuesta(CodigosEnum.CODIGO_200.getId(), mapaUsuarios.get(llave));
        } catch (Exception excepcion) {
            throw new ServiceException(CodigosEnum.CODIGO_400.getId());
        }
    }


    private void escribirDatosDeUsuario(String llave, Usuario usuario) throws ServiceException {
        try{
            mapaUsuarios.put(llave, usuario);
        } catch (Exception excepcion) {
            throw new ServiceException(CodigosEnum.CODIGO_401.getId());
        }
    }

    private static Class getClass(String classname) throws ClassNotFoundException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if(classLoader == null)
            classLoader = DatosUsuario.class.getClassLoader();
        return (classLoader.loadClass(classname));
    }

}
