package exercises.lsn1datatypes;

public class GasInquiry {
    public static void main (String[] args) {
        int milesValue;
        int gallonsConsumedValue;
        java.util.Scanner input;
        int milesPerGallon;

        input = new java.util.Scanner(System.in);

        System.out.println("How many miles have you driven?:"); // prompts user with question (prints phrase/question)
milesValue = input.nextInt();
        System.out.println("How much gas was consumed?:"); // prompts user with question (prints phrase/question)
gallonsConsumedValue = input.nextInt();
milesPerGallon = milesValue / gallonsConsumedValue;

        System.out.println("The miles per gallon is: " + milesPerGallon); // prompts user with question (prints phrase/question)






    }
}
