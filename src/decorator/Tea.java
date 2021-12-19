package decorator;

public class Tea extends HotDrink {
	double price = 0.5;
	
	public Tea(){
		description = "Tea";
	}
	
	@Override
	public Double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	

}
