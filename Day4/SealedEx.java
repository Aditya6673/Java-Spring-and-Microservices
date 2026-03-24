sealed class X permits Y,Z
{

}
final class Y extends X
{

}
non-sealed class Z extends X
{

}

// Note: A sealed class can only be extended by the classes specified in the 'permits' clause. 
// In this case, class Y is the only class that can extend class X. 
// The 'final' keyword is used to indicate that class Y cannot be further extended by any other class.
public class SealedEx {
    public static void main(String[] args) {
        
    }
}
