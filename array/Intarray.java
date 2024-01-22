package array;
public class Intarray {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9, 4, 7};

        // Initialize variables to store the min and max
        int min = numbers[0];
        int max = numbers[0];

        // Iterate through the array to find min and max
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            } else if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Print the results
        System.out.println("Smallest number: " + min);
        System.out.println("Largest number: " + max);
    }
}