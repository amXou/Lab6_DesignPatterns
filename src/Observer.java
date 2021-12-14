import java.util.ArrayList;

public class Observer implements Observer_I {
	@Override
    public void update(ArrayList<ShoppingCart> observable) {
           System.out.println("Observer: There're lost carts! ");
           //make all stores redo their lostCartLists
    }
}
