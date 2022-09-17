public class Task3 {
    public static void main(String[] args) {
        int[] array = differenceArray(new int[]{4, 3,2,1, 1}, new int[]{1,2,3,4});
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "; ");
        }
    }

    private static boolean equalityLengths(int[] arrayA, int[] arrayB){
        if (arrayA.length == arrayB.length){
            return true;
        }
        return false;
    }

    public static int[] differenceArray(int[] arrayA, int[] arrayB){
        if (!equalityLengths(arrayA, arrayB)) {
            throw new RuntimeException("array lengths are not equal");
        }
        int[] array = new int[arrayA.length];
        for (int i = 0; i < arrayA.length; i++) {
            array[i] = arrayA[i] - arrayB[i];
        }
        return array;
    }
}
