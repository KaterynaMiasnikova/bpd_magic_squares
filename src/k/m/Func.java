package k.m;

public class Func {
    public static String coding_magic_square(String input, int[][] square, int times) {
        int rows = square.length;
        int columns = square[0].length;
        StringBuilder code = new StringBuilder(replace(input, rows, columns));
        StringBuilder output = new StringBuilder();
        char[][] magic_square = new char[rows][columns];
        int count = 0;
        for (char c : code.toString().toCharArray()) {
            count++;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++){
                    if (square[i][j] == count) {
                        magic_square[i][j] = c;
                        if (count == (columns*rows)) {
                            int time = 0;
                            while(time < times) {
                                magic_square = turn_table_coding(magic_square);
                                time++;
                            }
                            int separator = 0;
                            for (int k = 0; k < columns; k++) {
                                for (int m = 0; m < rows; m++) {
                                    separator++;
                                    output.append(magic_square[m][k]);
                                    if (separator == 5) {
                                        output.append(" ");
                                        separator = 0;
                                    }
                                }
                            }
                            output.append("\n");
                            count = 0;
                        }
                    }
                }
            }
        }
        return output.toString();
    }

    public static String decoding_magic_square(String input, int[][] square, int times) {
        int rows = square.length;
        int columns = square[0].length;
        StringBuilder code = new StringBuilder(re_replace(input));
        StringBuilder output = new StringBuilder();
        char[][] magic_square = new char[rows][columns];
        int count = 0;
        int a = 0;
        int b = 0;
        for (char c : code.toString().toCharArray()) {
            magic_square[a++][b] = c;
            if (a == columns) {
                a = 0;
                b++;
                if (b == rows) {
                    int time = 0;
                    while (time < times) {
                        magic_square = return_table_coding(magic_square);
                        time++;
                    }
                    while (count <= (columns*rows)) {
                        for (int k = 0; k < columns; k++) {
                            for (int m = 0; m < rows; m++) {
                                if (square[m][k] == count) {
                                    output.append(magic_square[m][k]);
                                }
                            }
                        }
                        count++;
                    }
                    count = 0;
                    b = 0;
                }
            }
        }
        return output.toString();
    }

    private static char[][] turn_table_coding(char[][] table) {
        int rows = table.length;
        int columns = table[0].length;
        char[][] t = new char[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                t[j][i] = table[i][rows - 1 - j];
            }
        }
        return t;
    }

    private static char[][] return_table_coding(char[][] table) {
        int rows = table.length;
        int columns = table[0].length;
        char[][] t = new char[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                t[i][rows - 1 - j] = table[j][i];
            }
        }
        return t;
    }

    private static int how_many_tables(String input, int rows, int columns) {
        return (int) Math.ceil((double) input.length() / (rows * columns));
    }

    private static StringBuilder replace(String input, int rows, int columns) {
        int cells = how_many_tables(input, rows, columns);
        StringBuilder code = new StringBuilder(input.replace(" ", "_"));
        while (code.length() < rows * columns * cells) {
            code.append('_');
        }
        return code;
    }

    private static String re_replace(String input) {
        return input.replace("\n", "").replace(" ", "").replace("_", " ");
    }

}