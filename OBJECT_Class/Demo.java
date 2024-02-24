package OBJECT_Class;

class Laptop {
    String model; 
    int price; 

    public String toString() {
        return model + ":" + price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
    
}

public class Demo {
    public static void main(String[] args) {
        System.out.println("I am Ani.");

        Laptop obj1 = new Laptop();
        obj1.model = "Apple";
        obj1.price = 2000;

        System.out.println(obj1); // bydefault it is printing OBJECT_Class.Laptop@2f92e0f4
        System.out.println(obj1.toString()); // OBJECT_Class.Laptop@2f92e0f4
        // toString() is Object.class method. 

        // Lets method overridiing toString() method by creating toString method in Laptop class.

        System.out.println(obj1.toString());

        // if we want to find out objects are equal or not with both its hexcode and its values.

        Laptop obj2 = new Laptop();
        obj2.model = "Apple";
        obj2.price = 2000;

        System.out.println(obj1.equals(obj2));

        Laptop obj3 = new Laptop();
        obj3.model = "Samsung";
        obj3.price = 2000;

        System.out.println(obj1.equals(obj3));
    }
}
