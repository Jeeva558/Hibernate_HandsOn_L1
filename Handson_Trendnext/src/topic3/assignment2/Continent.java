package topic3.assignment2;

import java.util.Map;

public class Continent 
{
	private int id;
	private String cname;
	private Map<Country,Capital> countries;
	
	public Continent() {}
	public Continent(String cname, Map<Country, Capital> countries) {
		super();
		this.cname = cname;
		this.countries = countries;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Map<Country, Capital> getCountries() {
		return countries;
	}
	public void setCountries(Map<Country, Capital> countries) {
		this.countries = countries;
	}
}
