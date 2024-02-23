class Human {
    private int age;
    private String name;

    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }
    public int getAge() {
        return age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(22);
        obj.setName("Aniket");

        System.out.println(obj.getName() + " : " + obj.getAge());

        // With encapsulation we bind our data with human class methods.
        // obj.name = " adf"; // This is error.
    }
    
}