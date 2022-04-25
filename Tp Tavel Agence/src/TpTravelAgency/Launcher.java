package TpTravelAgency;

import TpTravelAgency.Dao.PlaceDao;
import TpTravelAgency.Dao.TripDao;

import java.util.Scanner;

public class Launcher {

    private static PlaceDao placeDao;
    private  static TripDao tripDao;
    Place place ;
    Scanner sc ;
    String name;
    
    public Launcher(DaoFactory myDaoFactory )
    {
    	sc = new Scanner(System.in);
    	placeDao = myDaoFactory.getPlaceDao();
    	tripDao =  myDaoFactory.getTripDao();
    	
    	place = null;
    	name = null;
     }
    

    public void start() {
        System.out.println("Welcome aboard!");
        int choice = 1;
     
        String menu = "1 - Add a place" + System.lineSeparator()   +
                      "2 - Find a place" + System.lineSeparator()  +
                      "3 - Edit a place" + System.lineSeparator()  +
                      "4 - Remove a place" + System.lineSeparator()+
                      "5 - Add a trip"     + System.lineSeparator() +
                      "0 - Exit" + System.lineSeparator();
        while (choice !=0) {
            System.out.println(menu);
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    addPlace();
                    break;
                case 2:
                    findPlace();
                    break;
                case 3:
                    editPlace();
                    break;
                case 4:
                    removePlace();
                    break;
                case 5:
                    addTrip();
                    break;
                case 0:
                	exit();
            }
        }
        
    }

    private void addTrip() {
        
        System.out.println("Type the id place corresponding of depart: ");
        int idDepart = sc.nextInt();
      
     
        Trip trip = new Trip();

        Place depart = new Place();
        depart.setId(idDepart);
        trip.setDepart(depart);
       
        System.out.println("Type the id place corresponding of destination: ");
        int idDest = sc.nextInt();

        Place destination = new Place();
        destination.setId(idDest);
        trip.setDestination(destination);
      
        System.out.println("Type the trip price: ");
        int price = sc.nextInt();
        trip.setPrice(price);
        int id = tripDao.createTrip(trip);
        System.out.println("Trip created successfully with id: " + id);
    }
    
    
    
    
    private void exit() {
    	System.out.println("Bye");
    	ConnectionManager.close();
    	sc.close();
    	System.exit(-1);
		
	}


	private void addPlace() {
        System.out.println("Type the place name: ");
        String name = sc.next();
        place = new Place(name);
        int id = placeDao.createPlace(place);
        if(id != 0)
           System.out.println("Place created successfully with id: "+ placeDao.createPlace(place) );
        else
        	System.out.println("failed to created place " );
        	
        
        //sc.close();
    }

    private void findPlace() {
        System.out.println("Type the place Id to find: ");
        int id =  sc.nextInt();
        place = placeDao.findPlaceById(id);
        if (place == null) {
            System.out.println("Unable to find place");
        } else {
            System.out.println("Place id: " + place.getId());
            System.out.println("Place name: " + place.getName());
        }
    }

    private void editPlace() {
    	
    	findPlace();
     
        System.out.println("Type the new place name: ");
        name = sc.next();
        sc.close();
        place.setName(name );
        
        if (placeDao.updatePlace(place)) {
            System.out.println("The place has been successfully updated");
        } else {
            System.out.println("Unable to find place with given id");
        }
    }

    private void removePlace() {
    	findPlace();
        if (placeDao.removePlace(place)) {
            System.out.println("The place has been successfully removed");
        } else {
            System.out.println("Unable to find place with given id");
        }
    }
}
