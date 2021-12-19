package decorator;

public class Coffee extends HotDrink{

		double price = 0.6;
		
		public Coffee(){
			description = "Coffee";
		}
		
		@Override
		public Double getPrice() {
			// TODO Auto-generated method stub
			return price;
		}
		

}


