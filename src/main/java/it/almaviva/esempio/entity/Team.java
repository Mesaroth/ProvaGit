package it.almaviva.esempio.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

@Entity
public class Team  {

    private Long id;
    private String name;
    private int members;
    private String primaryColor;
    
    public  Team() {}
    
    public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMembers(int members) {
		this.members = members;
	}

	public void setPrimaryColor(String primaryColor) {
		this.primaryColor = primaryColor;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMembers() {
        return members;
    }

    public String getPrimaryColor() {
        return primaryColor;
    }
    
    // setter methods
}