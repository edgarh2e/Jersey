package com.lux.authentication.services;

import com.lux.authentication.model.Usuario;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service("usuarioService")
public class UsuarioServiceImpl implements UsuarioService {

    private Usuario usuario = new Usuario();

    @CachePut(key = "T(com.lux.authentication.model.Usuario).hash(#usuario, #sucursal, #password, #keyCode)")
    public Usuario guardarDatosUsuario(Usuario usuario) {
        this.usuario = usuario;
        return this.usuario;
    }

    @Cacheable(value = "consultarDatosUsuario",
            key = "T(com.lux.authentication.model.Usuario).hash(#usuario, #sucursal, #password)")
    public Usuario consultarDatosUsuario(Usuario usuario) {
        return this.usuario;
    }
}
