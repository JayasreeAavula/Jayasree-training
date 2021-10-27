package com.java.rest1;

public class AgentExam {
	private int AgentID;
	   private String Name;
	   private String City;
	   private String Gender;
	   private int MaritalStatus;
	   private double Premium ;
	public int getAgentID() {
		return AgentID;
	}
	public void setAgentID(int agentID) {
		AgentID = agentID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getMaritalStatus() {
		return MaritalStatus;
	}
	public void setMaritalStatus(int maritalStatus) {
		MaritalStatus = maritalStatus;
	}
	public double getPremium() {
		return Premium;
	}
	public void setPremium(double premium) {
		Premium = premium;
	}
	@Override
	public String toString() {
		return "Agents [AgentID=" + AgentID + ", Name=" + Name + ", City=" + City + ", Gender=" + Gender
				+ ", MaritalStatus=" + MaritalStatus + ", Premium=" + Premium + "]";
	}
	   
}