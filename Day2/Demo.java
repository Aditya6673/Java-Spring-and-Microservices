package Day2;

class Computer{
    public void playMusic(){
        System.out.println("Playing music...");
    }
    public String getMeAPen(int cost){
        if(cost >= 10){
            return "Here is a pen for you.";
        }
        return "Sorry, the pen is too expensive.";
    }
}
public class Demo {
    public static void main(String[] args) {
        Computer comp = new Computer();
        comp.playMusic();
        System.out.println(comp.getMeAPen(15));
    }
}
