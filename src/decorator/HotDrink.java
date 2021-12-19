package decorator;

public abstract class HotDrink {
	public String description= " Unknown Drink ";

	public String getHotDrinkDescription(){
		return description;
	}
	
	public abstract Double getPrice();
}
