enum Laptop{
    Dell(1000), HP(1200), Lenovo, Apple(2000);
    private int price;
    private Laptop(){} // Default constructor
    private Laptop(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }   
}
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
public class Enum {
    public static void main(String[] args) {
        Day today = Day.MONDAY;
        System.out.println("Today is: " + today + " and its ordinal value is: " + today.ordinal());
        // The ordinal() method returns the position of the enum constant in its enum declaration, where the initial constant is assigned an ordinal of zero.
        switch (today) {
            case MONDAY:
                System.out.println("It's Monday!");
                break;
        
            default:
                System.out.println("It's not Monday.");
                break;
        }
        Laptop myLaptop = Laptop.Dell;
        System.out.println("My laptop is: " + myLaptop + " and its price is: " + myLaptop.getPrice());
        for(Laptop l : Laptop.values()){
            System.out.println(l + " costs " + l.getPrice());
        }
    }
}
