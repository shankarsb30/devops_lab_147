public class Main {

    // Method to perform bubble sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Outer loop for number of passes
        for (int i = 0; i < n - 1; i++) {
            // Inner loop for comparisons
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if elements are in the wrong order
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Main method to test the algorithm
    public static void main(String[] args) {
        int[] arr = {5,8,4,15,21};

        bubbleSort(arr);

        // Print sorted array
        for (int num : arr) {
            System.out.print(num+" ");
        }
    }
}
