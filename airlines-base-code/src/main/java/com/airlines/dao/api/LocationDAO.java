package com.airlines.dao.api;

import com.airlines.entities.Location;

public interface LocationDAO {
	
	public Location saveLocation(Location location);
	public void checkFlight(Location location);
	

}
