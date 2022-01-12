package it.almaviva.esempio.DTO;

import java.io.Serializable;

public class TeamDTO implements Serializable {

    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMembers() {
		return members;
	}
	public void setMembers(int members) {
		this.members = members;
	}
	public String getPrimaryColor() {
		return primaryColor;
	}
	public void setPrimaryColor(String primaryColor) {
		this.primaryColor = primaryColor;
	}
	private String name;
    private int members;
    private String primaryColor;
    
    // getter and setter
}