package com.dhl.ocnt.webservice.json;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dhl.ocnt.model.AssignMovementWrapper;
import com.dhl.ocnt.model.HandlingUnit;
import com.dhl.ocnt.model.Movement;
import com.dhl.ocnt.model.Page;
import com.dhl.ocnt.service.MovementService;
import com.dhl.webservice.dummy.CreateDummyData;

@Component
@Path("/movement")
public class MovementWebServiceJson {

	@Autowired
	private MovementService movementService;
	
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
	@Path("generateJson/{location}")
	@Produces(MediaType.APPLICATION_JSON)
	public Page<Movement> getMovement(@PathParam("location") String location){
		Page<Movement> list = movementService.getMovementList(200, 200, 1, 10, location);
		return list;
	}
	
	@POST
	@Path("generateJson/{plus_date}/{minus_date}/{location}")
	@Produces(MediaType.APPLICATION_JSON)
	public Page<Movement> getMovement(@PathParam("plus_date") int plus_date, 
											@PathParam("minus_date") int minus_date,
											@PathParam("location") String location){
		
		return movementService.getMovementList(plus_date, minus_date, 1, 10, location);
	}
	
	@POST
	@Path("/send")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response consumeDataAsJson(Movement movement){
		
		String output = movement.toString();
		
		return Response.status(200).entity(output).build();

	}
	

	
}
