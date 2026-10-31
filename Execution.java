public class Execution{
    static void Call(){
        System.out.println("Last Line");
        //Call2();
    }
    static void Call2(){
        System.out.println("Ok");
        int num =2;
        for (int i = 0; i < num; i++) {
            System.out.println(num + "*"+i+"="+(num*i));
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello");
        // Execution1 obj = new Execution1();
        // obj.Call();
        Call();
        System.out.println("Return");
        for (int i = 0; i < 10; i++) {
            Call2();
        }
    }
}