package com.lux.authentication.model;


public enum CodigosEnum {

    CODIGO_200(200, "Operación exitosa."),
    CODIGO_400(400, "Valores invalidos."),
    CODIGO_401(401, "Valores de entrada invalidos."),
    CODIGO_500(500, "Error en la aplicación.");

    private Integer id;
    private String descripcion;

    CodigosEnum(Integer id, String descripcion){
        this.id = id;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
