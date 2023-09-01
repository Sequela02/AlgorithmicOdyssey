// The problem asks us to find the sum of all the numbers that are multiples of
// 3 or 5 BELOW a given limit

public class SumOfMultiples {

    // Constant for the default limit, in this case is 1000
    private static final int DEFAULT_LIMIT = 1000;

    // Main method to execute the program
    public static void main(String[] args) {

        // Initialize the sum variable to 0
        int sum = 0;

        // Initialize the limit variable (could be replaced with user input)
        int limit = DEFAULT_LIMIT;

        // Calculate the sum of multiples
        sum = calculateSumOfMultiples(limit);

        // Output the sum of all multiples of 3 or 5 below the limit
        System.out.println("The sum of all multiples of 3 or 5 below " + limit + " is: " + sum);
    }

    /**
     * This method calculates the sum of all multiples of 3 or 5 that are less than the given limit.
     *
     * @param limit The upper bound for the multiples.
     * @return The sum of all multiples of 3 or 5 below the given limit.
     */
    private static int calculateSumOfMultiples(int limit) {
        // Initialize the sum variable to 0
        int sum = 0;

        // Loop through numbers from 1 to (limit - 1)
        // This loop iterates through each number and checks if it is a multiple of 3 or 5.
        for (int i = 1; i < limit; i++) {
            // Check if the current number (i) is a multiple of 3 or 5
            // If it is, it gets added to the sum
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        // Return the calculated sum
        return sum;
    }
}
