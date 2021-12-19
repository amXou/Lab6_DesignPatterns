package decorator;

public class Cream extends HotDrinkDecorator{
	HotDrink drink;
	
	double price = 0.1;
	String description = "Cream";
	
	public Cream(HotDrink drink) {
		this.drink = drink;	
	}
	
	@Override
	public String getHotDrinkDescription(){
		return drink.getHotDrinkDescription() + " + " + description;
	}
	
	@Override
	public Double getPrice(){
		return Math.round((drink.getPrice() + price) * 100.00)/100.0;
	}

}
