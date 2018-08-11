package com.airlines.dao.api;

import java.util.List;

import com.airlines.entities.Flight;


public interface FlightDAO {
	public Flight saveFlight(Flight flight);
	public boolean deleteFlight(Flight flight);
	public List<Flight> getAllFlight();
	public Flight getFlightByFlightId(int flightId);

}
