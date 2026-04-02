public class LaunchStart {
    public static void main(String[] args){
        Start s = new Start();
        int result = s.divide(10,5);
        if(result==5) System.out.println("Test passed");
        else System.out.println("Test failed");
    }
}