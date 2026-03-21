class Student{
    private String name;
    private int age;
    Student(String name, int age){
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
        Student s = new Student("Alice", 20);
        System.out.println(s.getName());
        System.out.println(s.getAge());
        s.setName("Bob");
        s.setAge(22);
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
