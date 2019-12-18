package com.test.test;


import javax.ws.rs.core.MultivaluedMap;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.core.util.MultivaluedMapImpl;

private static final  String baseUrl="http://localhost:8082/TestServer";

public void testMultivaluedMap (){
     ClientConfig cc = new DefaultClientConfig();
     Client c = Client.create(cc);
     MultivaluedMap  form = new MultivaluedMapImpl();
     form.add("name","ann zhang");
     form.add("nickname","ann ");
     WebResource wr = c.resource(baseUrl + "/test/formTest");
     String response = wr.post(String.class, form);
     System.out.println("result:"+response);
    
}

public void testMultivaluedMap2 (){
     ClientConfig cc = new DefaultClientConfig();
     Client c = Client.create(cc);
     MultivaluedMap  form = new MultivaluedMapImpl();
     form.add("name","ann zhang");
     form.add("nickname","ann ");
     WebResource wr = c.resource(baseUrl + "/test/formTest2");
     String response = wr.queryParam("uid", "10").post(String.class, form);
     System.out.println("result:"+response);
    
}
public static void main(String[] args){
    Test test = new Test();
    test.testMultivaluedMap();
    test.testMultivaluedMap2();
}

}