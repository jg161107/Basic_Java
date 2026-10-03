
public class DynamicAndStatic {

    public static void main(String[] args) {
        //static array
        int[] e = new int[5];
        e[0] = 10;
        e[1] = 20;
        e[2] = 30;
        e[3] = 40;
        for (int i = 0; i < 5; i++) {
            System.out.print(e[i] + " ");
        }
        //dynamic array
        int[] d = {10, 20, 30, 40};
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i]+" ");
        }
    }
}
