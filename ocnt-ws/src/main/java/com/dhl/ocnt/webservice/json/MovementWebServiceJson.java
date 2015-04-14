package com.dhl.ocnt.webservice.json;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import com.dhl.ocnt.model.Filter;
import com.dhl.ocnt.model.Movement;
import com.dhl.webservice.dummy.CreateDummyData;

@Path("/movement")
public class MovementWebServiceJson {

	private final static Logger logger = Logger
			.getLogger(MovementWebServiceJson.class);
	
	@POST
	@Path("generateJson")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Movement> getDataAsJson(){
		
		System.out.println("getDataAsJson()");
		
		List<Movement> movementList = new ArrayList<Movement>();
		
		movementList = CreateDummyData.createDummyData();
		
		//http://localhost:8080/ocnt-ws/rest/movement/generateJson
		
		return movementList;
	}
	
	@POST
	@Path("generateJson/{plus_date}/{minus_date}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Movement> getDataAsJson(@PathParam("plus_date") String plus_date, 
											@PathParam("minus_date") String minus_date){
		
		List<Movement> movementList = new ArrayList<Movement>();
		
		System.out.println("getDataAsJson() With Parameters");
		System.out.println("plus_date: "+plus_date);
		System.out.println("minus_date: "+minus_date);
		
		movementList = CreateDummyData.createDummyData(plus_date, minus_date);
		
		//http://localhost:8080/ocnt-ws/rest/movement/generateJson/{plus_date}/{minus_date}
		
		return movementList;
	}
	
	@POST
	@Path("getDestFilterAsJson")
	@Produces(MediaType.APPLICATION_JSON)
	public Filter getDestFilterAsJson(){
		
		Filter destFilterList = new Filter();
		
		System.out.println("getDestFilterAsJson");

		
		destFilterList = CreateDummyData.getDestFilterList();
		
		//http://localhost:8080/ocnt-ws/rest/movement/getDestFilterAsJson
		
		return destFilterList;
	}
	
	
	@POST
	@Path("/send")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response consumeDataAsJson(Movement movement){
		
		String output = movement.toString();
		
		return Response.status(200).entity(output).build();

	}
	

	
}
