package exercises.lsn1datatypes;
import java.util.Scanner;




public class JavaExCh1 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in); // scanner variable in method
        System.out.println("Hello, what is your name:"); // prompts user with question (prints phrase/question)
        String name = input.nextLine(); // collects user (input) response
        System.out.println("Hello " + name);

    }

}
