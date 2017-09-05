package morne;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("restservices")
public class MyRESTServices extends ResourceConfig 
{
    public MyRESTServices() 
    {
    	System.out.println("MORNE: In MyRESTServices...");
    	
        packages("com.fasterxml.jackson.jaxrs.json");
        packages("morne");
    }
}