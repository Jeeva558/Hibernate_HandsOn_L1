package topic1.assignment2;

public class Product 
{
private String ProductName;
private int ProductID;
private int price;
public String getProductName() {
	return ProductName;
}
public void setProductName(String productName) {
	ProductName = productName;
}
public int getProductID() {
	return ProductID;
}
public void setProductID(int productID) {
	ProductID = productID;
}
public int getPrice() {
	return price;
}
public Product(String productName, int price) {
	
	this.ProductName = productName;	
	this.price = price;
}
public Product() {
	// TODO Auto-generated constructor stub
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "Product [ProductName=" + ProductName + ", ProductID=" + ProductID + ", price=" + price + "]";
}

}
