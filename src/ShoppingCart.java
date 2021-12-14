
public class ShoppingCart {
	
	private String id;
	private String location;
	private String brand;
	
	public ShoppingCart(String id, Store store) {
		this.id = id;
		this.brand = store.getBrand();
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void setBrand(Store store) {
		this.brand = store.getBrand();
	}
	
	public String getLocation() {
		return location;
	}
	
	public String getID() {
		return id;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void printCart(){
		System.out.println(brand + id + ": " + location);
	}

}
