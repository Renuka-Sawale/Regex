import java.util.Scanner;
import java.util.regex.Pattern;

class PatternCheck {
    boolean test;
    public void testFirstName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First Name");
        String string = scan.nextLine();
        test= Pattern.compile("^[A-Z]{1}[a-z]{2,}").matcher(string).matches();
        if (test) {
            System.out.println("The given input is valid");
        }
        else {
            System.out.println("The given input is not valid");
        }
    }

public void testLastName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Last Name");
        String string = scan.nextLine();
        test= Pattern.compile("^[A-Z]{1}[a-z]{2,}").matcher(string).matches();
        if (test) {
            System.out.println("The given input is valid");
        }
        else {
            System.out.println("The given input is not valid");
        }
    }
}

public class UserRegistraction {
    public static void main(String[] args) {
        PatternCheck check = new PatternCheck();
        check.testFirstName();
	check.testLastName();
    }
}
