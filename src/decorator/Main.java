package decorator;

public class Main {
	
	public static void main(String[] args) {
		Coffee coffee = new Coffee();
		System.out.println(coffee.getHotDrinkDescription() + " costs: " + coffee.getPrice() + "ct");
		
		Tea tea = new Tea();
		System.out.println(tea.getHotDrinkDescription() + " costs: " + tea.getPrice() + "ct");
		
		Sugar coffeeWithSugar = new Sugar(coffee);
		Sugar coffeeDoubleSugar = new Sugar(coffeeWithSugar);
		System.out.println(coffeeWithSugar.getHotDrinkDescription() + " costs: " + coffeeWithSugar.getPrice() + "ct");
		System.out.println(coffeeDoubleSugar.getHotDrinkDescription() + " costs: " + coffeeDoubleSugar.getPrice() + "ct");
		
		Cream coffeeWithSugarAndCream = new Cream(coffeeWithSugar);
		System.out.println(coffeeWithSugarAndCream.getHotDrinkDescription() + " costs: " + coffeeWithSugarAndCream.getPrice() + "ct");

		Cream coffeeWithSugarAndDoubleCream = new Cream(coffeeWithSugarAndCream);
		System.out.println(coffeeWithSugarAndDoubleCream.getHotDrinkDescription() + " costs: " + coffeeWithSugarAndDoubleCream.getPrice() + "ct");
		
		System.out.println(coffee.getHotDrinkDescription() + " costs: " + coffee.getPrice() + "ct");
		
	}
}
