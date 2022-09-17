
public class Task3 {
	public static void main(String[] args) {
		int a = 90;
		int b = 3;
		if (b != 0) {
			System.out.println(a / b);
		}else{
			System.out.println("you can't divide by zero");
		}

		printSum(23, 234);

		int[] abc = {1, 2};
		int index = 2;
		if (index < abc.length && index >= 0) {
			abc[index] = 9;
		}else{
			System.out.println("The index goes beyond the size of the array!");
		}
	}

	public static void printSum(Integer a, Integer b){
		System.out.println(a + b);
	}
}
