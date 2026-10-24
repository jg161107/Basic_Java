
public class Strinput {

    public static void main(String[] args) {
        String str = "Jeet";
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println();

        String emp = " ";
        System.out.println(emp.isEmpty());
        System.out.println(emp.isBlank());
        System.out.println();

        String name = "    Jeet    ";
        System.out.println(name.length());
        name = name.trim();
        System.out.println(name);
        System.out.println();

        String name1 = "Helllo this is java.";
        System.out.println(name1.substring(3,7));
        System.out.println(name1.contains("hello"));
        System.out.println();

        int num = 3433;
        String str1 = String.valueOf(num);
        System.out.println(num+1);
        System.out.println(str1+1);
        System.out.println();

        String str2 = "Hello java World";
        System.out.println(str2.startsWith(str2));        
        System.out.println(str2.endsWith(str2));  
        System.out.println();      

        String name2 = "java";
        char[] c = name2.toCharArray();
        System.out.println(c);

        for(char ch: c){
            System.out.println("value: "+ch);

        }
        System.out.println();

        String name3 = "hello java this side is ai";
        // System.out.println(name3.split(" "));
        String[] words = name3.split(" ");
        for(String print : words){
            System.out.println(print);
        }
        System.out.println();

        String name4 = "car";
        name4 = name4.replace("c","w");
        System.out.println(name4);
        System.out.println();
    }
}
