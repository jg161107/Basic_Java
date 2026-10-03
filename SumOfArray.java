

public class SumOfArray{
    public static void main(String[] args) {
        int []d = {10,20,30,40,50,60};
        int sum = 0;
        System.out.println("Array is: ");
        for(int x : d){
            System.out.print(x+" ");
            System.out.println();
            sum = sum + x;
        }
        System.out.println("Sum of array is : "+sum);
    }
}