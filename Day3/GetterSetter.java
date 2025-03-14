class Boy{
    private String name;
    private int age;
    Boy(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
}
public class GetterSetter {
    public static void main(String[] args) {
        Boy b = new Boy("Alice", 20);
        System.out.println(b.getName());
        System.out.println(b.getAge());
        b.setName("Bob");
        b.setAge(22);
        System.out.println(b.getName());
        System.out.println(b.getAge());
    }
}
