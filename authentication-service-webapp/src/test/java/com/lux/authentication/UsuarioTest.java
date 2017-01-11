package com.lux.authentication;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import com.lux.authentication.model.Usuario;
import static junit.framework.Assert.*;
import org.glassfish.grizzly.http.server.HttpServer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;;

import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class UsuarioTest {

    private HttpServer server;
    private WebTarget target;

    @Before
    public void setUp() throws Exception {
        // create custom ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        // create JsonProvider to provide custom ObjectMapper
        JacksonJaxbJsonProvider provider = new JacksonJaxbJsonProvider();
        provider.setMapper(mapper);
        // start the server
        server = Main.startServer(provider);
        // create the client
        Client c = ClientBuilder.newClient();

        // uncomment the following line if you want to enable
        // support for JSON in the client (you also have to uncomment
        // dependency on jersey-media-json module in pom.xml and Main.startServer())
        // --
        // c.configuration().enable(new org.glassfish.jersey.media.json.JsonJaxbFeature());

        target = c.target(Main.BASE_URI);
    }

    @After
    public void tearDown() throws Exception {
        server.stop();
    }

    @Test
    public void testGuardarDatosUsuario() {
/*
        Invocation.Builder invocationBuilder = target.path("usuario/guardarDatosUsuario")
                .request(MediaType.APPLICATION_JSON);

        invocationBuilder.header("usuario", "1550")
                .header("sucursal", "12047")
                .header("password", "123456")
                .header("keyCode", "67867-234234-4564-890890");

        Response responseMsg = invocationBuilder.get();

        assertEquals("200", String.valueOf(responseMsg.getStatus()));
*/
    }

    @Test
    public void testValidarDatosUsuario() {
        /*
        Usuario user = new Usuario();
        user.setUsuario("1550");
        user.setSucursal("1234");
        user.setPassword("09832423");
        Response responseMsg = target.path("usuario/validarDatosUsuario")
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.json(user));
        assertEquals("200", String.valueOf(responseMsg.getStatus()));
        */
    }

}
