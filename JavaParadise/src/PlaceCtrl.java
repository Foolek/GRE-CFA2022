import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class PlaceCtrl {

	private static PlaceDao placeDao;
	private static TripDao tripDao;
	Place place;
	Scanner sc;
	String name;

	public PlaceCtrl(DaoFactory myDaoFactory) {
		placeDao = myDaoFactory.getPlaceDao();
		tripDao = myDaoFactory.getTripDao();

		place = null;
		name = null;
	}

	public List<Place> findAllPlaces() {
		List<Place> places = new ArrayList<>();
		places = placeDao.findAllPlaces();
		if (places == null) {
			System.out.println("Impossible de trouver cette ville");
		}

		return places;
	}


	public void addTrip() {

		System.out.println("Taper l'ID de la ville de départ: ");
		int idDepart = sc.nextInt();

		Trip trip = new Trip();

		Place depart = new Place();
		depart.setId(idDepart);
		trip.setDepart(depart);

		System.out.println("Taper l'ID de la ville de destination: ");
		int idDest = sc.nextInt();

		Place destination = new Place();
		destination.setId(idDest);
		trip.setDestination(destination);

		System.out.println("Taper le prix: ");
		int price = sc.nextInt();
		trip.setPrice(price);
		int id = tripDao.createTrip(trip);
		System.out.println("Voyage créé avec l'ID: " + id);
	}

	public void exit() {
		System.out.println("CIAO CIAO");
		ConnectionManager.close();
		sc.close();
		System.exit(-1);

	}

	public void addPlace(String name) {
		place = new Place(name);
		if (name == null) {
			JOptionPane.showMessageDialog(null, "aucun nom de ville saisi");
		} else {
			int id = placeDao.createPlace(place);
			if (id != 0)
				System.out.println("Ville ajoutée avec l'ID: " + id);
			else
				System.out.println("Echec à l'ajout de la ville.");
		}
		// sc.close();
	}

	public void removePlace(Place place) {
		int b_confirmdel = JOptionPane.showConfirmDialog(null, "Voulez vous vraiment supprimer la ville ?",
				"Suprression de la ville", JOptionPane.ERROR_MESSAGE);

		if (b_confirmdel == 0) {
			if (placeDao.removePlace(place)) {
				JOptionPane.showMessageDialog(null, "Ville supprimée avec succès.", "Suppression de la ville",
						JOptionPane.DEFAULT_OPTION);
			}
		}

	}
}
