package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.InlineResponse200;
import io.swagger.model.Timer;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2019-11-07T18:16:59.231Z[GMT]")public abstract class TimersApiService {
    public abstract Response addTimer(Timer body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteTimer(Long timerID,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getTimer(Long timerID,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getTimers(SecurityContext securityContext) throws NotFoundException;
    public abstract Response modifyTimer(Timer body,Long timerID,SecurityContext securityContext) throws NotFoundException;
}
