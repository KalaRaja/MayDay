package com.microservice.red.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;


@Path("/test")
public class MSTest {

	@GET
	public Response getMsg() {
		return Response.status(200).build();
 
	}
}
