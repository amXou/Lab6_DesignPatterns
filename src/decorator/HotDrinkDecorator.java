package decorator;

public abstract class HotDrinkDecorator extends HotDrink {

	
	public HotDrinkDecorator() {
	}
	
	@Override
	public abstract int getPrice();//in cents
 
}
