
public class Reverse {

    public static int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            int lstdgt = num % 10;
            rev = rev * 10 + lstdgt;
            num /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1234));
        System.out.println(reverse(-1234));
    }
}
