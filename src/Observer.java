import java.util.ArrayList;

public class Observer implements Observer_I {
	@Override
    public void update(ArrayList<ShoppingCart> observable) {
           System.out.println("Observer: A cart from brand: X with id: X location: X vanished");
           //make all stores redo their lostCartLists
    }
}
