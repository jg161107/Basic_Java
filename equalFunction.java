
public class equalFunction{
    public static void main(String[] args) {
        int[] a ={10,20,30,40,50};
        int[] b ={60,70,80,90,100};
        int[] c ={10,20,30,40,50};
        boolean isEqual = java.util.Arrays.equals(a, c);
        System.out.println(isEqual);

        isEqual = java.util.Arrays.equals(a, b);
        System.out.println(isEqual);
    }
}