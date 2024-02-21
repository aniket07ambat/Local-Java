
public class JaggedArrays {
    public static void main(String[] args) {
        // Jagged arrays : Number of elements in each array are not same.
        int num[][] = new int[3][];
        num[0] = new int[3]; 
        num[1] = new int[4]; 
        num[2] = new int[2]; 

        for(int row = 0; row < num.length; row++) {
            for (int col = 0; col < num[row].length; col++) {
                num[row][col] = (int) (Math.random() * 10);
            }
        }

        // Advantage of forEach loop is we don't have to specify length.
        for (int n[] : num) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

        // Multidimentionl array : They have arrays in arrays in arrys and so on.

        // 3 Dimentational array: 
        int num3[][][] = new int[5][4][3];

        

    }
}
