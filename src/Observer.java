
public class Observer implements Observer_I {
	@Override
    public void update(String location) {
           System.out.println("Observer: A cart was detected here: " + location);
    }
}
