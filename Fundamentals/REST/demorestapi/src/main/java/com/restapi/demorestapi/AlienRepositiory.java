package com.restapi.demorestapi;

import java.util.ArrayList;
import java.util.List;

import java.sql.*;

public class AlienRepositiory {
	List<Alien> aliens = null;

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

		try {
			// Load Drivers
			Class.forName("com.mysql.cj.jdbc.Driver");
			// create connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restdb", "root", "12345");

		} catch (Exception e) {
			System.out.println("Error in getting connections to db" + e.getMessage());
		}

	}

	public List<Alien> getAliens() {
		List<Alien> aliens = new ArrayList<>();
		// query to return all aliens
		String sql = "select * from alien";
		try {
			Statement stmt = con.createStatement();
			// store array of data into result set
			ResultSet rs = stmt.executeQuery(sql);

			// create loop beacuse it have multiple entries
			while (rs.next()) {
				Alien a = new Alien();
				a.setId(rs.getInt(1));
				a.setName(rs.getString(2));
				a.setPoints(rs.getInt(3));

				aliens.add(a);
			}
		} catch (Exception e) {
			System.out.println("Error in firing query" + e.getMessage());
		}

		return aliens;
	}

	public Alien getAlien(int id) {
//		Alien a1 = null;
//		
//		for(Alien a : aliens) {
//			if(a.getId() == id) {
//				System.out.print("Alien found" + a);
//				return a;
//			}
//		}	
//		
//		return new Alien();

		// query to return all aliens
		String sql = "select * from alien where id = " + id;
		Alien a = new Alien();
		try {
			Statement stmt = con.createStatement();
			// store array of data into result set
			ResultSet rs = stmt.executeQuery(sql);

			// it return only one object if id got matched
			if (rs.next()) {
				a.setId(rs.getInt(1));
				a.setName(rs.getString(2));
				a.setPoints(rs.getInt(3));
			}
		} catch (Exception e) {
			System.out.println("Error in firing query" + e.getMessage());
		}

		return a;
	}

	public void create(Alien a1) {
		// TODO Auto-generated method stub
//		aliens.add(a1);
		
		String sql = "Insert into alien values (?,?,?)";
		try {
			// prepared statement
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, a1.getId());
			stmt.setString(2, a1.getName());
			stmt.setInt(3, a1.getPoints());
			stmt.executeUpdate();

			
		} catch (Exception e) {
			System.out.println("Error in firing query" + e.getMessage());
		}
	}
	
	// update alien info
	public void update(Alien a1) {
		// TODO Auto-generated method stub
//		aliens.add(a1);
		
		String sql = "update alien set name = ?, points = ? where id = ?";
		try {
			// prepared statement
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, a1.getName());
			stmt.setInt(2, a1.getPoints());
			stmt.setInt(3, a1.getId());
			stmt.executeUpdate();

			
		} catch (Exception e) {
			System.out.println("Error in firing query" + e.getMessage());
		}
	}
	
	public void delete(int id) {
		// TODO Auto-generated method stub
//		aliens.add(a1);
		
		String sql = "delete from alien where id = " + id;
		try {
			// prepared statement
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			
		} catch (Exception e) {
			System.out.println("Error in firing query" + e.getMessage());
		}
	}
	
	
}
