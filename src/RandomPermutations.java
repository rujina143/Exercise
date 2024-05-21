import java.util.Random;

public class RandomPermutations {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Original array: ");
        printArray(array);

        for (int i = 0; i < 10; i++) {
            int[] permutation = array.clone();
            generateRandomPermutation(permutation);
            System.out.print("Random permutation " + (i + 1) + ": ");
            printArray(permutation);
        }
    }


    public static void generateRandomPermutation(int[] array) {
        Random random = new Random();

        for (int i = array.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }


    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

