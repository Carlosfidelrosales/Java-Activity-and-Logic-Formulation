public class fibonacciSeries {
    public static void main(String[] args) {
        int n = 10 + 1; // number of terms (added +1 so the terms will reach up to number 55 that was based from the pdf file.)
        int t1 = 0, t2 = 1; // the 1st and second digit in the sequence
        System.out.print("First " + n + " terms: "); // display the number of terms used in the sequence
        
        for (int i = 1; i <= n; i++) {
            System.out.print("\n" + t1 + " "); // display the numbers in the sequence 

            int sum = t1 + t2; // condition where the sequence is happening.
            t1 = t2;
            t2 = sum;

            
        }
    }
}