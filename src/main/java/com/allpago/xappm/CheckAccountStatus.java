package com.allpago.xappm;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/*
 * Test with : http://localhost:8080/RestWebService/xappm/test/hi
 */


@Path("/payment")
public class CheckAccountStatus {
	
	@POST
	@Path("/account/status/{param}")
	public Response checkStatus(@PathParam("param") String msg) {
		String output = "Jersey Message : " + msg;
 		return Response.status(200).entity(output).build();
 
	}

}
