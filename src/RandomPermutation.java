import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomPermutation {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int[] permutation = generateRandomPermutation();
            printArray(permutation);
        }
    }

    public static int[] generateRandomPermutation() {

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }


        int[] permutation = new int[10];

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randomIndex = random.nextInt(numbers.size());
            permutation[i] = numbers.remove(randomIndex);
        }

        return permutation;
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}


