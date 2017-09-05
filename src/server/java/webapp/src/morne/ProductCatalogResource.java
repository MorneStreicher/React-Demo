package morne;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("productcatalog")
public class ProductCatalogResource 
{    
    @GET
    @Path("search/category/{category}")
    @Produces(MediaType.APPLICATION_JSON)
    public Person searchByCategory(@PathParam("category") String category) 
    {
        Person person = new Person("Morne", category, 42);
        
        return person;
    }
}