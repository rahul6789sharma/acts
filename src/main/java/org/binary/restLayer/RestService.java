package org.binary.restLayer;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.binary.datalayer.models.Aircrfat;

@Path("/atcs")
public interface RestService {

	// http://localhost:8080/rest/atcs/test
	@GET
	@Path("/test")
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	public Response test() throws WebApplicationException;

	// http://localhost:8080/rest/atcs/aircrafts
	@GET
	@Path("/aircrafts")
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	public Response getAllairCraft() throws WebApplicationException;

	// http://localhost:8080/rest/atcs/aircraft
	@DELETE
	@Path("/aircraft")
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	public Response remove() throws WebApplicationException;

	@POST
	@Path("/aircraft")
	@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	public Response add(Aircrfat aircrfat) throws WebApplicationException;
}
