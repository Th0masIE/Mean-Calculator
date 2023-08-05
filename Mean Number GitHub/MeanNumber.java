import java.text.DecimalFormat;
import java.util.Scanner;

public class MeanNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to my Mean Number Calculator!");

        System.out.print("How many numbers do you want to calculate the mean and sum for? ");
        int n = scanner.nextInt();
        double[] numbers = new double[n];
        System.out.println("Please enter " + n + " numbers below to be calculated:");

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextDouble();
        }

        double mean = calculateMean(numbers);
        double sum = calculateSum(numbers);

        // Format the mean to display with two decimal points
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formattedMean = decimalFormat.format(mean);

        System.out.println("Mean: " + formattedMean);
        System.out.println("Sum: " + sum);

        System.out.println("Thank you for using my Mean Number Calculator!");

        scanner.close();
    }

    public static double calculateMean(double[] numbers) {
        double sum = 0;

        for (double number : numbers) {
            sum += number;
        }

        return sum / numbers.length;
    }

    public static double calculateSum(double[] numbers) {
        double sum = 0;

        for (double number : numbers) {
            sum += number;
        }

        return sum;
    }
}
