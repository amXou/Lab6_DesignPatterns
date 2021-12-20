package decorator;

public class Sugar extends HotDrinkDecorator{
	HotDrink drink;
	
	int price = 5;
	
	
	public Sugar(HotDrink drink) {
		this.drink = drink;
		description = "Sugar";
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
