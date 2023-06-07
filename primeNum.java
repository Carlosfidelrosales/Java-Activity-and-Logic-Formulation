public class primeNum {
    public static void main(String[] args) {
        int num = 29; // This is the number to test
        boolean isPrime = true;

        // This condition will check if a specific number given is a prime number or not
        for (int iterable = 2; iterable <= Math.sqrt(num); iterable++) {
            if (num % iterable == 0) {
                isPrime = false;
                break;
            }
        }

        // This is for the possible result of the number being tested.
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } 
        else {
            System.out.println(num + " is not a prime number.");
        }
    }
}