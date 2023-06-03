package k.m;

public class Main {
    public static void main(String[] args) {
        System.out.print("\nВхідна фраза:\n");
        String input = "Що же буде далі? 22 вік ближче, ніж здається!";
        System.out.print(input);
        System.out.print("\n");
        int[][] square = {
                {3, 16, 9, 22, 15},
                {20, 8, 21, 14, 2},
                {7, 25, 13, 1, 19},
                {24, 12, 5, 18, 6},
                {11, 4, 17, 10, 23}};
        System.out.print("\nШифрування способом магічного квадрата:\n");
        String output = Func.coding_magic_square(input, square, 3);
        System.out.print(output);
        System.out.print("\nДешифрування способом магічного квадрата:\n");
        String output_1 = Func.decoding_magic_square(output, square, 3);
        System.out.print(output_1);
        System.out.print("\n");
    }
}