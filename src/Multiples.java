public class Multiples {

    public static void main(String[] args) {
        int count = 0; // Variable to store the count of multiples

        // Loop through numbers below 1000 and count multiples of 3 or 5
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                count++;
            }
        }

        // Print the result
        System.out.println("Number of multiples of 3 or 5 below 1000: " + count);
    }
}
