
public class MultiDimensionalArray {
    public static void main(String[] args) {
        int num1[][] = new int[3][4];

        for(int row = 0; row < 3; row++) {
            for(int col = 0; col < 4; col++) {
                num1[row][col] = (int) (Math.random() * 10);
                System.out.print(num1[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println("Enhanced for loop");

        for(int n[] : num1) { // here n[] is single dimentational array not a variable
            for(int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

        for(int i[] : num1) {
            for(int j: i) {
                System.out.print(j + " ");
            }
            System.out.println();
        } 
    }
    
}
