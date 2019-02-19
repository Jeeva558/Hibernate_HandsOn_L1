package topic3.assignment2;

public class Capital 
{
	private int id;
	private String capitalname;

	public String getCapitalname() {
		return capitalname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public Capital() {}

	public Capital(String capitalname) {
		super();
		this.capitalname = capitalname;
	}

	public void setCapitalname(String capitalname) {
		this.capitalname = capitalname;
	}
}
