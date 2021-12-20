package decorator;

public class Tea extends HotDrink {
	int price = 50;
	
	public Tea(){
		description = "Tea";
	}
	
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	

}
