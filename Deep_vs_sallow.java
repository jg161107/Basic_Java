public class Deep_vs_sallow{
    public static void main(String[] args) {
        int []a = {10,20,30};
        int[] shallow_copy = a;
        shallow_copy[0] = 99;
        System.out.println("Shallow copy: "+a[0]);
        System.out.println(a);

        int[] deep_copy = java.util.Arrays.copyOf(a, a.length);
        deep_copy[0] = 90;
        System.out.println("Deep copy: "+a[0]);
        System.out.println(a);
    }
}