package dao;

import java.util.List;

import entities.Place;

public interface PlaceDao {

    int createPlace(Place place);

    Place findPlaceById(int id);

    boolean updatePlace(Place place);

    boolean removePlace(Place place);

    List<Place> findAllPlaces();
}
