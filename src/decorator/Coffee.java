package decorator;

public class Coffee extends HotDrink{

		int price = 60;
		
		public Coffee(){
			description = "Coffee";
		}
		
		@Override
		public int getPrice() {
			// TODO Auto-generated method stub
			return price;
		}
		

}


