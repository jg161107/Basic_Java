
public class Basic {

    static void printTable() {
        for (int i = 1; i <= 10; i++) {
            int ans = 2 * i;
            System.out.println("->" + ans);
        }
    }

    static void printSum(int x, int y) {
        System.out.println("sum: " + (x + y));
    }

    static int subtraction(int p, int q) {
        return p - q;
    }

    static int subtraction(int p, int q, int r) {
        return q - p - r;
    }

    public static void main(String[] args) {

        int result_1 = subtraction(11, 12, 11);
        System.out.println(result_1);

        int result = subtraction(20, 2);
        System.out.println(result);

        printSum(10, 20);

        printTable();

    }

}
