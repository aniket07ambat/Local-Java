class Human3 {
    private int age;
    private String name;


    public Human3() {  // This is default constructor.
        this.age = 12;
        this.name = "Aniket";
        System.out.println("In constructor");
        System.out.println("These are Industry standards conventions whenever you want to perform some operations always do in methods.");
        // Don't do in open. Like changeing instance variables.
    }

    public Human3(int a, String n) { // This is parameterized constructor.
        this.age = a;
        this.name = n;
    }

    public void setAge(int a) {
        age = a;
    }
    public int getAge() {
        return age;
    }

    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }
    
}

public class Constructor {
    public static void main(String[] args) {
        Human3 obj = new Human3();
        // Whenever obj is created, constructor is called.
        Human3 obj2 = new Human3(23, "Sam");
        
        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj2.getName() + " : " + obj2.getAge());
    }
}
