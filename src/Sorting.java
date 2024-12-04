import java.util.Random;

public class Sorting {

    private int[] array; // Instance variable to hold the array

    // Constructor
    public Sorting(int size) {
        array = new int[size]; // Initialize the array with the given size
        fillArrayWithRandomNumbers(); // Populate the array with random integers

        System.out.println("Original Array:");
        printArray();

        // Sort the array
        bubbleSort();

        System.out.println("Sorted Array:");
        printArray();
    }

    // Method to fill the array with random integers
    private void fillArrayWithRandomNumbers() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); // Random numbers between 0 and 99
        }
    }

    // Method to print the array
    public void printArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Method to sort the array using bubble sort
    public void bubbleSort() {

    }

    // Main method
    public static void main(String[] args) {
        Sorting sorter = new Sorting(10);

    }
}
