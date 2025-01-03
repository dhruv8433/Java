package com.hibernate.DemoHibernatee;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

/**
 * This is a Hibernate Entity class representing the Alien table in the database.
 * Each instance of this class corresponds to a record in the database table.
 */

// @Entity annotation marks this class as a Hibernate entity.
// By default, it maps to a table named "Alien", but here we specify a custom table name.
@Entity // Creates a table named "alien_table" in the database.
// @Embeddable
public class Alien { // This is a POJO (Plain Old Java Object) representing the Alien entity.
	
	// @Id annotation marks this field as the primary key for the table.
	@Id
	private int aid; // Alien ID (Primary Key)
	
	//	@Column(name="alien_name") this annotation used to change column name in db instead of aname
	
//	private String aname;
	
	// now we use new class object from AlienName
	 private AlienName aname; // Alien name
	
//	public String getAname() {
//		return aname;
//	}

//	public void setAname(String aname) {
//		this.aname = aname;
//	}

	// @Transient will not store color in db
	private String color; // Alien color

	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
	}

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
	public AlienName getAlienName() {
		return aname;
	}
	
	/**
	 * Setter for Alien name.
	 * @param aname The name to set for the alien.
	 */
	public void setAlienName(AlienName aname) {
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
