public class LargestInArray {

    static void findSmallestAndLargest(int arr[], int n) {

        int smallest = arr[0];
        int largest = arr[0];


        for (int i = 1; i < n; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
            if (arr[i] > largest) {

                largest = arr[i];
            }
        }


        for (int i = 0; i < n; i++) {
            if (arr[i] == smallest) {
                arr[i] = -smallest; // mark smallest with negative value
            }
            if (arr[i] == largest) {
                arr[i] = 2 * largest; // mark largest with double value
            }
        }


        System.out.println("Modified array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        System.out.println("Smallest element is: " + smallest);
        System.out.println("Largest element is: " + largest);
    }


    public static void main(String args[]) {
        int arr[] = {10, 324, 45, 90, 9808};
        int n = arr.length;
        findSmallestAndLargest(arr, n);
    }
}