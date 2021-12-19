import java.util.*;

public class Store {
	private String brandName;
	ArrayList<ShoppingCart> myLostCarts = new ArrayList<>();
	
	public Store(String brand) { //Lidl, Aldi, Edeka, Kaufhof, Penny, Bauhaus, unknown
		brandName = brand;
	}
	
	public String getBrand() {
		return brandName;
	}
	
	public void getLostCarts(ShoppingCartList bigList){ //one big ShoppingCartList used for every Store, like the one and only database
		for(ShoppingCart cart : bigList.getList()) {
			if(cart.getBrand().equals(brandName)) {
				myLostCarts.add(cart);
			}
		}
	}
	
	public void printLostCarts() {
		System.out.println(brandName + ":");
		for(ShoppingCart cart : myLostCarts) {
			cart.printCart();
		}
		System.out.println();
	}
	
	
	
}
