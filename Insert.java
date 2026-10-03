
import java.util.Scanner;

public class Insert {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of array: ");
        int size = sc.nextInt();
        int[] a = new int[size + 1];
        System.out.print("Array is: ");
        for (int i = 0; i < a.length-1; i++) {
            System.out.print("Enter element no. " + i+": ");
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the location where you want to add element: ");
        int loc = sc.nextInt();
        System.out.print("Enter the value of new element: ");
        int val = sc.nextInt();
        for (int i = a.length-1; i >= loc; i--) {
            if (i != loc) {
                a[i] = a[i - 1];
            } else {
                a[loc] = val;
            }
        }
        System.out.println("Updated Array: ");
        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}
