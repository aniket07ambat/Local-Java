class Human1 {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }
    // public void setAge(int age, Human obj) {
    //     Human obj1 = obj;
    //     obj1.age = age;
    // }
    public void setAge(int age) {
        this.age = age; // here this refers to current object which is calling setAge. means obj in This class. vala object.
    }
    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }

}

public class This {
    public static void main(String[] args) {
        Human1 obj = new Human1();  // this. referes to obj.
        obj.setAge(30);
        obj.setName("ANiket");
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
    // In heap obj object's age is now assigned as 30. 
    // Stack only contain obj's address .
}
