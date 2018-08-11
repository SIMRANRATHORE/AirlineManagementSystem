package com.airlines.entities;

public class Location {
	
	private int locationId;
	private String timeOfArrive;
	private String timeOfDispature;
	private String from;
	private String to;
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public String getTimeOfArrive() {
		return timeOfArrive;
	}
	public void setTimeOfArrive(String timeOfArrive) {
		this.timeOfArrive = timeOfArrive;
	}
	public String getTimeOfDispature() {
		return timeOfDispature;
	}
	public void setTimeOfDispature(String timeOfDispature) {
		this.timeOfDispature = timeOfDispature;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
}
