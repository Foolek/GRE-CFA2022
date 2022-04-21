package TpTravelAgency;





public class Trip {

    private int id;
    private Place depart;
    private Place destination;
    private int price;

    public Trip(int idDepart, int idDestination, int price) {
		
	}

	public Trip() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Place getDepart() {
        return depart;
    }

    public void setDepart(Place depart) {
        this.depart = depart;
    }

    public Place getDestination() {
        return destination;
    }

    public void setDestination(Place destination) {
        this.destination = destination;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trip trip = (Trip) o;

        if (depart != null ? !depart.equals(trip.depart) : trip.depart != null) return false;
        if (destination != null ? !destination.equals(trip.destination) : trip.destination != null) return false;
        if (id != 0 ? !(id ==trip.id) : trip.id != 0) return false;
        if (price != 0 ? !(price == trip.price) : trip.price != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != 0 ? ( (Integer)id).hashCode() : 0;
        result = 31 * result + (depart != null ? depart.hashCode() : 0);
        result = 31 * result + (destination != null ? destination.hashCode() : 0);
        result = 31 * result + (price != 0 ? ((Integer)price).hashCode() : 0);
        return result;
    }
}
