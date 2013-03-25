package br.com.services.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/helloworld")
public class HelloWorldResource {
	
	@GET 
	@Produces("text/html") 
	public String showHelloWorld() { 
		return "Ol‡ mundo!"; 
	} 

}
