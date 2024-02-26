package AbstractKeyword;

abstract class CarBig {
    public abstract void showCar();
    public abstract void print();
}

class MarutiCar extends CarBig {
    public void showCar() {
        System.out.println("Car IN CarBig");
    }

    
}

public class InnerAbstract {
    public static void main(String[] args) {
        // CarBig obj1 = new CarBig();  //Gives error
        CarBig obj2 = new MarutiCar();
        obj2.showCar();


        obj2 = new MarutiCar() {
            public void showCar() {
                System.out.println("Car in inner");
            }
            public void print() {
                System.out.println("I am Programmer.");
            }
            
        };

        // Here  Anonymous Inner class is created. We get  Anonymous Inner class's object not MarutiCar's Object
        obj2.showCar();
        obj2.print();
        

        
    }
}
