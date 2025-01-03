package com.hql.HQLExample;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.Cacheable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien {
    @Id
    private int aid;

    //@Embedded
    //private AlienName aname; // Alien name

    private String aname;
    private String color; // Alien color

    // Getters, setters, and toString
    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	@Override
    public String toString() {
        return "Alien [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
    }
}
