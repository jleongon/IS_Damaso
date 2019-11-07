package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.TimersApiService;
import io.swagger.api.factories.TimersApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.InlineResponse200;
import io.swagger.model.Timer;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;


@Path("/timers")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2019-11-07T18:16:59.231Z[GMT]")public class TimersApi  {
   private final TimersApiService delegate;

   public TimersApi(@Context ServletConfig servletContext) {
      TimersApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("TimersApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (TimersApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = TimersApiServiceFactory.getTimersApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Añade un nuevo temporizador", description = "Se añade un nuevo temporizador", tags={ "Temporizadores" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Temporizador añadido con éxito", content = @Content(schema = @Schema(implementation = InlineResponse200.class))),
        
        @ApiResponse(responseCode = "405", description = "Entrada inválida"),
        
        @ApiResponse(responseCode = "406", description = "Entrada ya existente") })
    public Response addTimer(@Parameter(description = "Nuevo temporizador" ,required=true) Timer body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addTimer(body,securityContext);
    }
    @DELETE
    @Path("/{timerID}")
    
    
    @Operation(summary = "Borra un temporizador específico", description = "Borra los datos de un temporizador específico.", tags={ "Temporizadores" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Éxito"),
        
        @ApiResponse(responseCode = "404", description = "El temporizador no existe"),
        
        @ApiResponse(responseCode = "405", description = "Entrada inválida") })
    public Response deleteTimer(@Parameter(description = "ID único del temporizador a borrar.",required=true) @PathParam("timerID") Long timerID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteTimer(timerID,securityContext);
    }
    @GET
    @Path("/{timerID}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Devuelve un temporizador específico.", description = "Devuelve los datos de un temporizador específico.", tags={ "Temporizadores" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Éxito", content = @Content(schema = @Schema(implementation = Timer.class))),
        
        @ApiResponse(responseCode = "404", description = "El temporizador no existe"),
        
        @ApiResponse(responseCode = "405", description = "Entrada inválida") })
    public Response getTimer(@Parameter(description = "ID único del temporizador a obtener",required=true) @PathParam("timerID") Long timerID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getTimer(timerID,securityContext);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @Operation(summary = "Obtiene los temporizadores programados actualmente", description = "Se obtiene una lista con todos los temporizadores, salvo que no haya ninguno programado", tags={ "Temporizadores" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Éxito", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Timer.class)))),
        
        @ApiResponse(responseCode = "408", description = "No hay temporizadores programados actualmente") })
    public Response getTimers(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getTimers(securityContext);
    }
    @PUT
    @Path("/{timerID}")
    @Consumes({ "application/json" })
    
    @Operation(summary = "Modifica un temporizador específico", description = "Modifica los datos de un temporizador específico.", tags={ "Temporizadores" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Éxito"),
        
        @ApiResponse(responseCode = "404", description = "El temporizador no existe"),
        
        @ApiResponse(responseCode = "405", description = "Entrada inválida") })
    public Response modifyTimer(@Parameter(description = "Temporizador modificado" ,required=true) Timer body

,@Parameter(description = "ID único del temporizador a modificar.",required=true) @PathParam("timerID") Long timerID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.modifyTimer(body,timerID,securityContext);
    }
}
