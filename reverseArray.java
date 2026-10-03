
public class reverseArray {

    public static void main(String[] args) {
        int d[] = {10,20,30,40,50};
        System.out.print("Array is: ");
        for(int x : d){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.print("Reverse Order: ");
        for(int i=d.length-1; i>=0; i--){
            System.out.print(d[i]+" ");
        }
    }
}

