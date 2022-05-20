package dao;

import java.util.List;

import entities.Trip;
import entities.Trip;

public interface TripDao {

	int createTrip(Trip trip);

	List<Trip> findAllTrips();




}
