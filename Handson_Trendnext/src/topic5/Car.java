package topic5;

public class Car
{
private String RegNo;
private String Model;
private String Color;
private String Manufacturer;
private int Price;
public Car() {}
public Car(String regNo, String model, String color, String manufacturer, int price) {
	super();
	RegNo = regNo;
	Model = model;
	Color = color;
	Manufacturer = manufacturer;
	Price = price;
}
public String getRegNo() {
	return RegNo;
}
public void setRegNo(String regNo) {
	RegNo = regNo;
}
public String getModel() {
	return Model;
}
public void setModel(String model) {
	Model = model;
}
public String getColor() {
	return Color;
}
public void setColor(String color) {
	Color = color;
}
public String getManufacturer() {
	return Manufacturer;
}
public void setManufacturer(String manufacturer) {
	Manufacturer = manufacturer;
}
public int getPrice() {
	return Price;
}
public void setPrice(int price) {
	Price = price;
}

}
