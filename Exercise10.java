import java.util.Arrays;

public class Exercise10 {
    public static void main(String[] args) {
        int[] a = {0, 1, 1, 1, 0, 1,};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = 1;
            } else {
                a[i] = 0;
            }
        }
        System.out.println("\nИзмененный массив:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}





