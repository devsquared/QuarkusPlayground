package com.devsquared.sample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/data")
public class DataResource {

	// lets hook up a postgresql database and the maven dependency for that
	// then we will add data with a simple rest endpoint
	// then we can query for it later
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String createRandomData()
	{
		return null;
	}
}