package decorator;

public class Cream extends HotDrinkDecorator{
	HotDrink drink;
	
	int price = 10;
		
	public Cream(HotDrink drink) {
		this.drink = drink;
		description = "Cream";
	}
	
	@Override
	public String getHotDrinkDescription(){
		return drink.getHotDrinkDescription() + " + " + description;
	}
	
	@Override
	public int getPrice(){
		return drink.getPrice() + price;
	}

}
