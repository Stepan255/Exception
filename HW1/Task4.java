public class Task4 {
    public static void main(String[] args) {
        int[] array = differenceArray(new int[]{4, 3,2,1}, new int[]{1,2,1,4});
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "; ");
        }
    }

    public static int[] differenceArray(int[] arrayA, int[] arrayB){
        if (!validate(arrayA, arrayB)) {
            throw new RuntimeException("invalid data");
        }
        int[] array = new int[arrayA.length];
        for (int i = 0; i < arrayA.length; i++) {
            array[i] = arrayA[i] / arrayB[i];
        }
        return array;
    }

    private static boolean validate(int[] arrayA, int[] arrayB) {
        if (arrayA == null || arrayB == null){
            throw new RuntimeException("one of the arrays is equal to 'null");
        }
        if (arrayA.length != arrayB.length){
            throw new RuntimeException("array lengths are not equal");
        }
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayB[i] == 0){
                throw new RuntimeException("dev by zero on position: " + i);
            }
        }
        return true;
    }
}
