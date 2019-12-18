package com.test.web.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import org.springframework.stereotype.Component;


@Path("/test")
@Component
public class Test {
    
    @POST
    @Path("/formTest")
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Consumes("application/x-www-form-urlencoded")
    public String formTest(MultivaluedMap<String, String>  formParams) {
        String result  = "";
        result = "name:" + formParams.getFirst("name") + " ; nickname:"+formParams.getFirst("nickname");
        return result;
    }
    @POST
    @Path("/formTest2")
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Consumes("application/x-www-form-urlencoded")
    public String formTest2(@QueryParam("uid")Long uid,MultivaluedMap<String, String>  formParams) {
        String result  = "";
        result ="uid"+ uid + " ; name:" + formParams.getFirst("name") + " ; nickname:"+formParams.getFirst("nickname");
        return result;
    }

}