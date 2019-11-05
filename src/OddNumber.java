public class OddNumber {

    public static void main(String... args) {

        int result = 0;
        int[] array = new int[10];

        System.out.print("Array: ");
        for ( int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 200 + 1);
            System.out.print(array[i] + " ");
        }

        for (int j : array) {
            if ((j % 2 != 0) && (j > result)) {
                result = j;
            }
        }
        System.out.print("\nBiggest odd number - " + result);
    }
}
