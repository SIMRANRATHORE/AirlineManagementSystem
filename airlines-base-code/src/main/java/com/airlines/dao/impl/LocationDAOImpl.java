package com.airlines.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.airlines.dao.api.LocationDAO;
import com.airlines.entities.Location;
import com.airlines.model.DBConnect;

public class LocationDAOImpl implements LocationDAO {

	public Location saveLocation(Location location) {
		
		PreparedStatement ps=null;
		try {
			ps=DBConnect.getConnection().prepareStatement("insert into location(froms,tos,arriveTime,"
					+ "dispactureTime values(?,?,?,?))");
			ps.setString(2, location.getFrom());
			ps.setString(3, location.getTo());
			ps.setString(4, location.getTimeOfArrive());
			ps.setString(5, location.getTimeOfDispature());
			ps.executeQuery();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return location;
	}

	public void checkFlight(Location location) {
		
		
	}

}
