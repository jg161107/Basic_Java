public class Static{
    static int var1 = 11;
    int var2 = 22;
    public static void main(String[] args) {
        System.out.println(var1);
        Static obj = new Static();
        System.out.println(obj.var2);
    }
}