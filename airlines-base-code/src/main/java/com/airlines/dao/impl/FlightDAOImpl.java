package com.airlines.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.airlines.dao.api.FlightDAO;
import com.airlines.entities.Flight;
import com.airlines.model.DBConnect;

public class FlightDAOImpl implements FlightDAO {
	
	public Flight saveFlight(Flight flight){
		
		PreparedStatement ps=null;
		try {
			ps=DBConnect.getConnection().prepareStatement("insert into flight(flightName,seats) values(?,?)");
			ps.setString(2, flight.getFlightName());
			ps.setInt(3, flight.getSeats());
			ps.executeQuery();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return flight;
		
	}

	public boolean deleteFlight(Flight flight) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Flight> getAllFlight() {
		// TODO Auto-generated method stub
		return null;
	}

	public Flight getFlightByFlightId(int flightId) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
