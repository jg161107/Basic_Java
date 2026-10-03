public class MaxElement{
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter array: ");
        for (int i = 0; i < size; i++) {
            a[i]=sc.nextInt();            
        }
        int max = a[0];
        for(int i=1; i<size; i++){
            if(a[i]>max)
                max = a[i];
        }
        System.out.println(max);
    }
}