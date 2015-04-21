package com.dhl.ocnt.webservice.json;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import com.dhl.ocnt.model.AssignMovementWrapper;
import com.dhl.ocnt.model.HandlingUnit;
import com.dhl.ocnt.model.Movement;
import com.dhl.ocnt.model.MovementWrapped;
import com.dhl.webservice.dummy.CreateDummyData;

@Path("/movement")
public class MovementWebServiceJson {

	private final static Logger logger = Logger
			.getLogger(MovementWebServiceJson.class);
	
	@POST
	@Path("getAssignMovementAllocatedDataAsJson")
	@Produces(MediaType.APPLICATION_JSON)
	public List<HandlingUnit> getAssignMovementAllocatedDataAsJson(){
		
		System.out.println("getAssignMovementAllocatedDataAsJson()");
		
		AssignMovementWrapper assignMovementList = new AssignMovementWrapper();
		
		assignMovementList = CreateDummyData.createAmcDummyData();
		
		//http://localhost:8080/ocnt-ws/rest/movement/getAssignMovementAllocatedDataAsJson
		
		return assignMovementList.getHu_data_allocated();
	}
	
	@POST
	@Path("getAssignMovementNonAssignedDataAsJson")
	@Produces(MediaType.APPLICATION_JSON)
	public List<HandlingUnit> getAssignMovementNonAssignedDataAsJson(){
		
		System.out.println("getAssignMovementNonAssignedDataAsJson()");
		
		AssignMovementWrapper assignMovementList = new AssignMovementWrapper();
		
		assignMovementList = CreateDummyData.createAmcDummyData();
		
		//http://localhost:8080/ocnt-ws/rest/movement/getAssignMovementNonAssignedDataAsJson
		
		return assignMovementList.getHu_data_notAssigned();
	}
	
	@POST
	@Path("generateJson")
	@Produces(MediaType.APPLICATION_JSON)
	public MovementWrapped getDataAsJson(){
		
		System.out.println("getDataAsJson()");
		
		MovementWrapped movementList = new MovementWrapped();
		
		movementList = CreateDummyData.createDummyData();
		
		//http://localhost:8080/ocnt-ws/rest/movement/generateJson
		
		return movementList;
	}
	
	@POST
	@Path("generateJson/{plus_date}/{minus_date}")
	@Produces(MediaType.APPLICATION_JSON)
	public MovementWrapped getDataAsJson(@PathParam("plus_date") String plus_date, 
											@PathParam("minus_date") String minus_date){
		
		MovementWrapped movementList = new MovementWrapped();
		
		System.out.println("getDataAsJson() With Parameters");
		System.out.println("plus_date: "+plus_date);
		System.out.println("minus_date: "+minus_date);
		
		movementList = CreateDummyData.createDummyData(plus_date, minus_date);
		
		//http://localhost:8080/ocnt-ws/rest/movement/generateJson/{plus_date}/{minus_date}
		
		return movementList;
	}
	
	
	
	@POST
	@Path("/send")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response consumeDataAsJson(Movement movement){
		
		String output = movement.toString();
		
		return Response.status(200).entity(output).build();

	}
	

	
}
