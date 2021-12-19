package decorator;

public class Sugar extends HotDrinkDecorator{
	HotDrink drink;
	
	double price = 0.05;
	
	
	public Sugar(HotDrink drink) {
		this.drink = drink;
		description = "Sugar";
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
