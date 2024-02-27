// See the video to understand this example.
// https://www.youtube.com/watch?v=BGTx91t8q50&list=PLsyeobzWxl7q6oUFts2erdot6jxF_lisP&index=4&t=358s

interface  Computer {
     void code();
}

class Desktop implements Computer{
    public void code() {
        System.out.println("code in Desktop, compile, run.. faster");
    }
}

class Laptop implements Computer {
    public void code() {
        System.out.println("code in Laptop, compile, run..");
    }
}

// class Developer {
//     public void devApp(Laptop lap) { // herer we are tightly binding Developer to Laptop class means Developer only works on Laptop.
//         lap.code();
//     }
// }

class Developer {
    public void devApp(Computer lap) {  // By useing Computer instead of Laptop we make Developer class loosely dependent on Laptop .
        lap.code();
    }
}


public class NeedOfInterface {
    public static void main(String[] args) {
        Laptop lap = new Laptop();
        Desktop desk = new Desktop();

        Developer Aniket = new Developer();
        Aniket.devApp(desk);
    }
}
