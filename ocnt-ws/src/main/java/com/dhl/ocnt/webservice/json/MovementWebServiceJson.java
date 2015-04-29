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
import com.dhl.ocnt.service.HandlingUnitInMovementService;
import com.dhl.ocnt.service.MovementService;
import com.dhl.webservice.dummy.CreateDummyData;

@Component
@Path("/movement")
public class MovementWebServiceJson {

	@Autowired
	private MovementService movementService;
	
	@Autowired
	private HandlingUnitInMovementService huService;
	
	@POST
	@Path("getAssignMovementAllocatedDataAsJson/{movementId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Page<HandlingUnit> getAssignMovementAllocatedDataAsJson(@PathParam("movementId") String movementId){
		
		System.out.println("getAssignMovementAllocatedDataAsJson()");
		
		//AssignMovementWrapper assignMovementList = new AssignMovementWrapper();
		
		//assignMovementList = CreateDummyData.createAmcDummyData();
		
		//http://localhost:8080/ocnt-ws/rest/movement/getAssignMovementAllocatedDataAsJson
		
		Page<HandlingUnit> huList = huService.getHandlingUnitInMovementList(movementId, 1, 100);
		return huList;
	}
	
	@POST
	@Path("getAssignMovementNonAssignedDataAsJson/{movementId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Page<HandlingUnit> getAssignMovementNonAssignedDataAsJson(@PathParam("movementId") String movementId){
		
		System.out.println("getAssignMovementNonAssignedDataAsJson()");
		
		//AssignMovementWrapper assignMovementList = new AssignMovementWrapper();
		
		//assignMovementList = CreateDummyData.createAmcDummyData();
		
		//http://localhost:8080/ocnt-ws/rest/movement/getAssignMovementNonAssignedDataAsJson
		
		Page<HandlingUnit> huList = huService.getHandlingUnitNotAllocated(movementId, 1, 100);
		return huList;
	}
	
	@POST
	@Path("generateJson/{location}")
	@Produces(MediaType.APPLICATION_JSON)
	public Page<Movement> getMovement(@PathParam("location") String location){
		Page<Movement> list = movementService.getMovementList(300, 300, 1, 10, location);
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
