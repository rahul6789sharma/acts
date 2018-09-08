package org.binary.restLayer;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.binary.datalayer.dataStore.AircrfatDaoImpl;
import org.binary.datalayer.dataStore.Dao;
import org.binary.datalayer.models.Aircrfat;

public class RestServiceImpl implements RestService {

	private Dao<Aircrfat> aircraft = new AircrfatDaoImpl();

	public Response test() {

		try {
			return Response.status(Status.OK).entity("OK").build();
		} catch (Exception e) {
			Response response = Response.status(Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
			throw new WebApplicationException(response);
		}
	}

	@Override
	public Response getAllairCraft() throws WebApplicationException {
		try {
			return Response.status(Status.OK).entity(aircraft.getAll()).build();
		} catch (Exception e) {
			Response response = Response.status(Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
			throw new WebApplicationException(response);
		}

	}

	@Override
	public Response remove() throws WebApplicationException {

		try {
			return Response.status(Status.OK).entity(aircraft.removeHigestPriorityAircraft()).build();
		} catch (Exception e) {
			Response response = Response.status(Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
			throw new WebApplicationException(response);
		}

	}

	@Override
	public Response add(Aircrfat aircrfat) throws WebApplicationException {

		try {
			aircraft.save(aircrfat);
			return Response.status(Status.CREATED).entity(aircrfat).build();
		} catch (Exception e) {
			Response response = Response.status(Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
			throw new WebApplicationException(response);
		}

	}
}
