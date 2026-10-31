
public class StringBuilderDemo {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello ");
        sb.append("War ");
        System.out.println(sb);
        sb.insert(10, "Beautiful ");
        System.out.println(sb);
        sb.replace(6, 15, "Awesome ");
        System.out.println(sb);
        sb.delete(5,13);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
