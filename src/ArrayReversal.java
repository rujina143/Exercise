public class ArrayReversal {
    public static void main(String[] args) {
        int[] array = {1, 4, 9, 16, 9, 7, 4, 9, 11};

        System.out.print("Original array: ");
        printArray(array);

        reverseArray(array);

        System.out.print("Reversed array: ");
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;


            left++;
            right--;
        }
    }


    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
