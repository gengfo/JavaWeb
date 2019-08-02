package com.lf.config;

import org.glassfish.jersey.server.ResourceConfig;

import com.lf.rest.resources.HelloResource;

public class JerseyResourcesConfig extends ResourceConfig {

    public JerseyResourcesConfig(){
        register(HelloResource.class);
    }
}
