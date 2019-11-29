package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.InlineResponse200;
import io.swagger.model.Timer;
import io.swagger.v3.core.util.Json;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;
import utils.TimerMetric;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import java.io.DataOutputStream;
import java.net.Socket;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2019-11-07T18:16:59.231Z[GMT]")public class TimersApiServiceImpl extends TimersApiService {
	
	Map<Long, Timer> map = new HashMap<Long, Timer>();
	long id = 0;
	
	public TimersApiServiceImpl () {	
		TimerMetric timer = new TimerMetric();
		timer.run();
	}
	
	@Override
    public Response addTimer(Timer body, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
		body.setIdTimer(id);
		map.put(id, body);		
        return Response.ok().entity(Long.toString(id++)).build();
    }
    @Override
    public Response deleteTimer(Long timerID, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
    	if(!map.containsKey(timerID))
    		return Response.status(404).build();
    	map.remove(timerID);
        return Response.ok().entity("").build();
    }
    @Override
    public Response getTimer(Long timerID, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
    	if(!map.containsKey(timerID))
    		return Response.status(404).build();
        return Response.ok().entity(Json.pretty(map.get(timerID))).build();
    }
    @Override
    public Response getTimers(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
    	if( map.size() == 0)
    		return Response.status(408).build();
        return Response.ok().entity(Json.pretty(map.values().toArray())).build();
    }
    @Override
    public Response modifyTimer(Timer body, Long timerID, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
    	if(!map.containsKey(timerID))
    		return Response.status(404).build();
    	map.put(timerID.longValue(), body);
        return Response.ok().entity("").build();
    }
}
