public class Reduce {

    public static void main(String[] args) {
        int n = 100;  // Starting number
        int steps = 0;  // Variable to count the number of steps

        // Loop until n is reduced to 0
        while (n > 0) {
            if (n % 2 == 0) {
                n = n / 2;  // If n is even, divide it by 2
            } else {
                n = n - 1;  // If n is odd, subtract 1
            }
            steps++;  // Increment the step count
        }

        // Print the number of steps
        System.out.println("Number of steps to reduce 100 to 0: " + steps);
    }
}