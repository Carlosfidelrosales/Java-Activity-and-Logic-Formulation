public class patternTriangle {
    public static void main(String[] args) {
        int rows_triangle = 5; // Number of rows in the triangle

        for (int i = 1; i <= rows_triangle; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
} 