public class Place {

	private int id;
	private String name;

	public Place(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Place(String name) {
		this.name = name;
	}

	public Place() {
	}

	public Place(int idDepart) {
		this.id = idDepart;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Place place = (Place) o;

		if (id != 0 ? !(id == place.id) : place.id != 0)
			return false;
		if (name != null ? !name.equals(place.name) : place.name != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = 0;
		// int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		// return "[" + id + "] " + name;
		return "- " + name;
	}

	public void getNameById() {
		// TODO Auto-generated method stub

	}
}
