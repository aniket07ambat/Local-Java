
class ARRAY {

    public int[] ArrayCreation(int n) {
        
        int numbers[] = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = (int) (Math.random() * 10);
        }
        return numbers;
    }

    public void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
            
        }
        System.out.println();
    }

    public void largestNumber(int arr[]) {
        int max = 0;
        for (int i : arr) {
            if(max < i) 
                max = i;
        }
        System.out.println(max);
    }
}

class Calculator {

    public void MultiplicationTable(int n) {
        for (int index = 1; index <= 10; index++) {
            // System.out.println(n + " * " + index + " = " + n*index );
            System.out.printf("%d * %d = %d\n", n, index, n * index);
        }
    }

    public void SumOfNaturalNumbers(int n) {
        int sum = n * (n + 1) / 2;
        System.out.println(sum);
    }

    public void PrimeOrNot(int n) {
        if (n <= 1) {
            System.out.println(n + " is not prime number.");
            return;
        }
        int i = 2;
        while (i <= Math.sqrt(n)) {
            if(n % i == 0) {
                System.out.println(n + " is not prime number.");
                return;
            } 
            i++;
        }
        System.out.println(n + " is prime number.");
    }

    public int factorial(int n) {
        if(n <= 0) {
            return 1;
        }
        return factorial(n - 1 ) * n;
    }
}

public class One_practice {
    public static void main(String[] args) {
        
        Calculator obj1 = new Calculator();
        ARRAY obj2 = new ARRAY();
        int n = 36;
        // Multiplication Table.
        // obj1.MultiplicationTable(n);

        // Sum of first n natural numbers.
        // obj1.SumOfNaturalNumbers(n);

        obj1.PrimeOrNot(n);

        // Find the largest number in the array and create and print with random numbers.
        
        int students[] = obj2.ArrayCreation(n);

        // obj2.printArray(students);

        // obj2.largestNumber(students);

        System.out.println(obj1.factorial(4));

        

    }
}
