package TpTravelAgency.Dao;

import TpTravelAgency.Place;

import java.util.List;

public interface PlaceDao {

    int createPlace(Place place);

    Place findPlaceById(int id);

    boolean updatePlace(Place place);

    boolean removePlace(Place place);

    List<Place> findAllPlaces();
}
