public class maxValue {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9, 2, 4, 6, 8}; // list of numbers to be compared for their value
        int max = numbers[0];
        
        for (int i = 1; i < numbers.length; i++) { // condition in finding the maximum numbers in an array.
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // prints the result of the program
        System.out.println("In numbers 1,3,5,7,9,2,4,6,8: \n\n");
        System.out.println("The maximum value in the array is: " + max);
    }
}