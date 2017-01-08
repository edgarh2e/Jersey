package com.lux.authentication.jaxrs.provider;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

@Provider
public class ObjectMapperProvider implements ContextResolver<ObjectMapper> {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    static {
        OBJECT_MAPPER.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        OBJECT_MAPPER.disable(MapperFeature.USE_GETTERS_AS_SETTERS);
        OBJECT_MAPPER.enable(SerializationFeature.INDENT_OUTPUT);
    }

    public ObjectMapperProvider() {
        System.out.println("Instantiate ObjectMapperProvider");
    }

    @Override
    public ObjectMapper getContext(final Class<?> type) {
        System.out.println("ObjectMapperProvider.getContext() called with type: "+type);
        return OBJECT_MAPPER;
    }
}
