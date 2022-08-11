package com.tienda.security.jwt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
Esta clase va a comprobar si hay un token válido, si no va a devolver una respuesta 401 de
Usuario NO AUTORIZADO
Esta clase rechaza todas las peticiones que no estén autenticadas
*/
@Component
public class JwtEntryPoint implements AuthenticationEntryPoint {

    private final static Logger logger = LoggerFactory.getLogger(JwtEntryPoint.class);
    
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        logger.error("Fail en el metodo commence");
        response.sendError(HttpServletResponse.SC_UNAUTHORIZED,"No autorizado");
    }
}
