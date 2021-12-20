
public class Main {
	public static void main(String[] args) throws InterruptedException {
		//initialising objects
		ShoppingCartList list = new ShoppingCartList();
		Observer o1 = new Observer();
		list.registerObserver(o1);
		
		Store s1 = new Store("Edeka1");
		Store s2 = new Store("Edeka2");
		Store s3 = new Store("Aldi");
		Store s4 = new Store("Lidl");
		Store s5 = new Store("Kaufhof");
		Store s6 = new Store("Bauhaus");
		Store s7 = new Store("Penny");
		
		//assign new carts to stores
		ShoppingCart c1 = new ShoppingCart("001", s1);
		ShoppingCart c2 = new ShoppingCart("002", s1);
		ShoppingCart c3 = new ShoppingCart("003", s1);
		ShoppingCart c4 = new ShoppingCart("004", s2);
		ShoppingCart c5 = new ShoppingCart("005", s3);
		ShoppingCart c6 = new ShoppingCart("006", s4);
		ShoppingCart c7 = new ShoppingCart("007", s5);
		ShoppingCart c8 = new ShoppingCart("008", s6);
		ShoppingCart c9 = new ShoppingCart("009", s7);
		ShoppingCart c10 = new ShoppingCart("010", s7);
		ShoppingCart c11 = new ShoppingCart("011", s6);
		
		//set test values
		c1.setLocation("behind the trashbin");
		c4.setLocation("rainbowLand");
		c11.setLocation("in front of Notre Dame");
		
		list.addLostCart(c1);
		list.addLostCart(c4);
		list.addLostCart(c11);
		
		s1.getLostCarts(list);
		s2.getLostCarts(list);
		s3.getLostCarts(list);
		s4.getLostCarts(list);
		s5.getLostCarts(list);
		s6.getLostCarts(list);
		s7.getLostCarts(list);
		
		
		s1.printLostCarts();
		s2.printLostCarts();
		s3.printLostCarts();
		s4.printLostCarts();
		s5.printLostCarts();
		s6.printLostCarts();
		s7.printLostCarts();
		
	}
}
