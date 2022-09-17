import java.util.Stack;

public class Task1 {
    public static void main(String[] args) {
        emptyStack();
        arrayStore();
        negativeArraySize();
    }

    public static void negativeArraySize(){
        int[] array = new int[-1];
    }

    public static void arrayStore(){
        Object[] array = new String[10];
        array[0] = '8';
    }

    public static void emptyStack(){
        Stack s = new Stack<>();
        s.pop();
    }
}
