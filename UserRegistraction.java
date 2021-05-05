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

    public void testEmail() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Email");
        String string = scan.nextLine();
        test= Pattern.compile("^[a-zA-Z[0-9]+.-]*+[a-zA-Z0-9+]*@[a-zA-Z0-9+.,]*+$").matcher(string).matches();
        if (test) {
            System.out.println("The given email is valid");
        }
        else {
            System.out.println("The given email is not valid");
        }
    }

    public void testPhoneNo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Phone number");
        String string = scan.nextLine();
        test= Pattern.compile(("^[0-9]{1,2} [0-9]{10}")).matcher(string).matches();
        if (test) {
            System.out.println("The given phone number is valid");
        }
        else {
            System.out.println("The given phone number is not valid");
        }
    }
}

public class UserRegistraction {

    public static void main(String[] args) {
        PatternCheck check = new PatternCheck();
        check.testFirstName();
	check.testLastName();
	check.testEmail();
	check.testPhoneNo();
    }
}
