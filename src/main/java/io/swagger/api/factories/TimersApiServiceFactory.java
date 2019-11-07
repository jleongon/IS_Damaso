package io.swagger.api.factories;

import io.swagger.api.TimersApiService;
import io.swagger.api.impl.TimersApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2019-11-07T18:16:59.231Z[GMT]")public class TimersApiServiceFactory {
    private final static TimersApiService service = new TimersApiServiceImpl();

    public static TimersApiService getTimersApi() {
        return service;
    }
}
