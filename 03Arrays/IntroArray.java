// Arrays are objects. [we use new word in it.]
// So they are stored in heap in continious fashion.
// Drawback is they have fixed size.

// By default, the values of integer arrays are zero.

public class IntroArray {
    public static void main(String[] args) {
        // Array creation
        int num[] = {1, 3, 4, 65, 4};
        System.out.println(num[0]);

        int num2[] = new int[2];
        num2[0] = 9;
        num2[1] = 90;
        int length = num2.length;
        for (int index = 0; index < length; index++) {
            System.out.println(num2[index]);
        }

        String num3[] = new String[3];

        String names[] = {"Aniket", "DFS", "DP"};
        System.out.println(names[0]);
    }
}
// int num[][] = new int[3][4] 
// Here we have array containing 3 arrays which Individually contains four elements.
