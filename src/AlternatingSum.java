import java.util.Scanner;

public class AlternatingSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the elements of the array, separated by spaces:");
        String input = scanner.nextLine();


        String[] stringNumbers = input.split(" ");

        int[] numbers = new int[stringNumbers.length];
        for (int i = 0; i < stringNumbers.length; i++) {
            numbers[i] = Integer.parseInt(stringNumbers[i]);
        }

        int alternatingSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                alternatingSum += numbers[i];
            } else {
                alternatingSum -= numbers[i];
            }
        }

        System.out.println("The alternating sum is: " + alternatingSum);
    }
}

