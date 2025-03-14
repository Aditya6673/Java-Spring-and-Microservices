interface P
{

    
}
class Ball implements P
{
    public void display()
    {
        System.out.println("This is a marker interface example.");
    }
}
public class MarkerInterface {
    public static void main(String[] args) {
        P obj = new Ball();
        if (obj instanceof A) {
            ((Ball) obj).display();
        } else {
            System.out.println("Object does not implement the marker interface.");
        }
    }
}
