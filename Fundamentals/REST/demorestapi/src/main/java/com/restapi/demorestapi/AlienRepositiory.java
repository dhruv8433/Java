package com.restapi.demorestapi;

import java.util.ArrayList;
import java.util.List;

import java.sql.*;

public class AlienRepositiory {
	List<Alien> aliens;
	
	Connection con = null;
	public AlienRepositiory() {
//		aliens = new ArrayList<>();
//		
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
//		aliens.add(a1);
//		aliens.add(a2);
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "12345");
	}
	
	public List<Alien> getAliens(){
		return aliens;
	}
	
	public Alien getAlien(int id) {
		Alien a1 = null;
		
		for(Alien a : aliens) {
			if(a.getId() == id) {
				System.out.print("Alien found" + a);
				return a;
			}
		}	
		
		return new Alien();
	}

	public void create(Alien a1) {
		// TODO Auto-generated method stub
		aliens.add(a1);
	}
}
