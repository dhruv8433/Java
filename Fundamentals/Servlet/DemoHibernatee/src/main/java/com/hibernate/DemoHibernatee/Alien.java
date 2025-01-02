package com.hibernate.DemoHibernatee;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * This is a Hibernate Entity class representing the Alien table in the database.
 * Each instance of this class corresponds to a record in the database table.
 */

// @Entity annotation marks this class as a Hibernate entity.
// By default, it maps to a table named "Alien", but here we specify a custom table name.
@Entity(name="alien_table") // Creates a table named "alien_table" in the database.
public class Alien { // This is a POJO (Plain Old Java Object) representing the Alien entity.
	
	// @Id annotation marks this field as the primary key for the table.
	@Id
	private int aid; // Alien ID (Primary Key)

	private String aname; // Alien name
	private String color; // Alien color

	/**
	 * Getter for Alien ID.
	 * @return The ID of the alien.
	 */
	public int getAid() {
		return aid;
	}

	/**
	 * Setter for Alien ID.
	 * @param aid The ID to set for the alien.
	 */
	public void setAid(int aid) {
		this.aid = aid;
	}

	/**
	 * Getter for Alien name.
	 * @return The name of the alien.
	 */
	public String getAname() {
		return aname;
	}

	/**
	 * Setter for Alien name.
	 * @param aname The name to set for the alien.
	 */
	public void setAname(String aname) {
		this.aname = aname;
	}

	/**
	 * Getter for Alien color.
	 * @return The color of the alien.
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Setter for Alien color.
	 * @param color The color to set for the alien.
	 */
	public void setColor(String color) {
		this.color = color;
	}
}
