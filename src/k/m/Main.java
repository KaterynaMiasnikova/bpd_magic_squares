package k.m;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nPassphrase for encryption:\n");
        String input = in.nextLine();//"You become responsible, forever, for what you have tamed.";
        System.out.print(input);
        System.out.print("\n");
        int[][] square = {
                {3, 16, 9, 22, 15},
                {20, 8, 21, 14, 2},
                {7, 25, 13, 1, 19},
                {24, 12, 5, 18, 6},
                {11, 4, 17, 10, 23}};
        System.out.print("\nEncryption using the magic square method:\n");
        String output = Func.coding_magic_square(input, square, 3);
        System.out.print(output);
        System.out.print("\nDecryption using the magic square method:\n");
        String output_1 = Func.decoding_magic_square(output, square, 3);
        System.out.print(output_1);
        System.out.print("\n");
    }
}