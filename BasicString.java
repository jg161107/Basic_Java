
public class BasicString {

    public static void main(String[] args) {
        String firstName = "Jeet";
        String lastName = new String("Gohel");
        System.out.println("Full name: " + firstName + " " + lastName);
        System.out.println("Length of First Name: " + firstName.length());
        System.out.println("Length of Last Name: " + lastName.length());
        System.out.println("2nd character of first name: " + firstName.charAt(2));

        String newName = "jeet";
        if (firstName == newName) {
            System.out.println("Strings are equal"); 
        }else {
            System.out.println("Strings are equal");
        }

        String newName1 = "Jeet";
        if (firstName.equals(newName1)) {
            System.out.println("Strings are equal"); 
        }else {
            System.out.println("Strings are equal");
        }

        if (firstName.equalsIgnoreCase(newName1)) {
            System.out.println("Strings are equal"); 
        }else {
            System.out.println("Strings are equal");
        }

    }
}
