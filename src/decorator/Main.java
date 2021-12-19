package decorator;

public class Main {
	
	public static void main(String[] args) {
		Coffee coffee = new Coffee();
		System.out.println(coffee.getHotDrinkDescription() + " costs: " + coffee.getPrice() + "€");
		
		Tea tea = new Tea();
		System.out.println(tea.getHotDrinkDescription() + " costs: " + tea.getPrice() + "€");
		
		Sugar coffeeWithSugar = new Sugar(coffee);
		Sugar coffeeDoubleSugar = new Sugar(coffeeWithSugar);
		System.out.println(coffeeWithSugar.getHotDrinkDescription() + " costs: " + coffeeWithSugar.getPrice() + "€");
		System.out.println(coffeeDoubleSugar.getHotDrinkDescription() + " costs: " + coffeeDoubleSugar.getPrice() + "€");
		
		Cream coffeeWithSugarAndCream = new Cream(coffeeWithSugar);
		System.out.println(coffeeWithSugarAndCream.getHotDrinkDescription() + " costs: " + coffeeWithSugarAndCream.getPrice() + "€");

		Cream coffeeWithSugarAndDoubleCream = new Cream(coffeeWithSugarAndCream);
		System.out.println(coffeeWithSugarAndDoubleCream.getHotDrinkDescription() + " costs: " + coffeeWithSugarAndDoubleCream.getPrice() + "€");
		
		System.out.println(coffee.getHotDrinkDescription() + " costs: " + coffee.getPrice() + "€");
		
	}
}
