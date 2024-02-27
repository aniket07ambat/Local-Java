class Computer {

    public void playMusic() {
        System.out.println("Playing music....");
    }

    public String getMePen(int cost) {
        if(cost >= 10) 
            return "Pen";
        else 
            return "Nothing";

    }
}

class MethodOverriding {
    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }
    public double add(int n1, double n2) {
        return n2 + n1;
    }
}

public class Methods {
    public static void main(String a[]) {
        Computer compute = new Computer();
        compute.playMusic();

        String pen = compute.getMePen(10);
        System.out.println(pen);

        System.out.println("Hi");

        MethodOverriding obj = new MethodOverriding();
        
        int result = obj.add(3, 8, 3);
        System.out.println(result);

        double result2 = obj.add(4, 13234.123);
        System.out.println(result2);

        
    }
}
