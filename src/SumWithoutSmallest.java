
    public class SumWithoutSmallest {

        public static int sumWithoutSmallest(int[] values) {

            if (values == null || values.length == 0) {
                throw new IllegalArgumentException("Array must contain at least one element.");
            }
            if (values.length == 1) {
                return 0;
            }


            int sum = 0;
            int smallest = values[0];


            for (int value : values) {
                sum += value;
                if (value < smallest) {
                    smallest = value;
                }
            }


            return sum - smallest;
        }

        public static void main(String[] args) {
            int[] values = {5, 3, 8, 2, 7};
            System.out.println("Sum without smallest: " + sumWithoutSmallest(values));
        }
    }


