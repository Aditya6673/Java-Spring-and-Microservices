record Alien(int id, String name) {
    // Records automatically generate constructor, getters, equals, hashCode, and toString methods
    // You can also add additional methods if needed
    public Alien{
        if (id <= 0) {
            throw new IllegalArgumentException("ID must be positive");
        }
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
    }
}
public class RecordEx {
    public static void main(String[] args) {
        Alien alien = new Alien(1, "John");
        Alien alien2 = new Alien(1, "John");
        System.out.println(alien.equals(alien2)); // true
        System.out.println(alien);
        Alien alien3 = new Alien(0, "Jane");
        System.out.println(alien3);
    }
}
