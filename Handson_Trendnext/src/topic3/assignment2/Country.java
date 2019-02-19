package topic3.assignment2;

public class Country 
{
	private int id;
	private String countryname;

	public String getCountryname() {
		return countryname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Country()
	{
		
	}
	public Country(String countryname) {
		super();
		this.countryname = countryname;
	}

	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
}
