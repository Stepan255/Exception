public class Task2 {
	public static void main(String[] args) {
		int[] intArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
		int d = 0;
		for (int i = 0; i < intArray.length; i++) {
			if (d != 0){
				double catchedRes1 = intArray[i] / d;
				System.out.println("catchedRes1 = " + catchedRes1);
			} else {
				System.out.println("you can't divide by zero");
			}
		}
	}
}