package com.restapi.demorestapi;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResource {

	AlienRepositiory repo = new AlienRepositiory();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Alien> getAlien() {
		System.out.println("Alien called...");

//		Alien a1 = new  Alien();
//		a1.setId(101);
//		a1.setName("dhruv");
//		a1.setPoints(70);
//		
//		Alien a2 = new  Alien();
//		a2.setId(102);
//		a2.setName("rni");
//		a2.setPoints(80);
//		
//		List<Alien> aliens = Arrays.asList(a1,a2);

//		return aliens;
		return repo.getAliens();
	}

	// single alien
	@GET
	@Path("alien/{id}") // Use a dynamic path parameter
	@Produces(MediaType.APPLICATION_JSON)
	public Alien getParticularAlien(@PathParam("id") int id) {
		System.out.println("Fetching Alien with ID: " + id);
		return repo.getAlien(id);
	}

	// store data in db
	@POST
	@Path("alien")
	public Alien createAlien(Alien a1) {
		System.out.println("alien" + a1);
		repo.create(a1);

		return a1;
	}

	@PUT
	@Path("alien")
	public Alien updateAlien(Alien a1) {
		System.out.println("alien" + a1);
		
		// we use getID() beacuase it provide object we can't directly use null condtion check
		if (repo.getAlien(a1.getId()).getId() == 0) {
			System.out.println("No user found to update. creating one...");
			repo.create(a1);
		} else {
			repo.update(a1);
		}

		return a1;
	}

	@DELETE
	@Path("alien/{id}")
	public int deleteAlien(@PathParam("id") int id) {
		System.out.println("alien" + id);
		repo.delete(id);

		return id;
	}
}
