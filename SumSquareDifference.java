/**
 * This program calculates the difference between the sum of the squares of the first n natural numbers
 * and the square of the sum of the first n natural numbers.
 *
 * For example, for n = 10:
 * Sum of squares = 1^2 + 2^2 + ... + 10^2 = 385
 * Square of sum = (1 + 2 + ... + 10)^2 = 3025
 * Difference = 3025 - 385 = 2640
 */
public class SumSquareDifference {
    public static void main(String[] args) {
        // Change this to 10 to get the original problem's numbers
        int n = 100;
        int sumOfSquares = calculateSumOfSquares(n);
        int squareOfSum = calculateSquareOfSum(n);
        int difference = squareOfSum - sumOfSquares;

        // Output the results
        System.out.println("The sum of the squares of the first " + n + " numbers is: " + sumOfSquares);
        System.out.println("The square of the sum of the first " + n + " numbers is: " + squareOfSum);
        System.out.println("The difference between the square of the sum and the sum of squares is: " + difference);
    }

    /**
     * Calculates the sum of the squares of the first n natural numbers.
     *
     * @param n The number of natural numbers to consider.
     * @return The sum of the squares of the first n natural numbers.
     */
    static int calculateSumOfSquares(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    /**
     * Calculates the square of the sum of the first n natural numbers.
     *
     * @param n The number of natural numbers to consider.
     * @return The square of the sum of the first n natural numbers.
     */
    static int calculateSquareOfSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum * sum;
    }
}
