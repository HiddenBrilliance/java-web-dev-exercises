package exercises.lsn1datatypes;


public class NumericTypes {
    public static void main (String[] args) {

        int widthValue;
        int lengthValue;
        java.util.Scanner input;
        int area;


        input = new java.util.Scanner(System.in);
        System.out.println("What is the length of the rectangle? ");
        lengthValue = input.nextInt();
        System.out.println("What is the width of the rectangle? ");
        widthValue = input.nextInt();
        area = widthValue * lengthValue;
        System.out.println("The area of the rectangle is: " + area);






//        System.out.println("What is the length of the rectangle? ");
//        lengthValue = input.nextInt();// handle user response
//        System.out.println("What is the width of the rectangle? ");
//        widthValue = input.nextInt(); // handle user response
//        area = lengthValue * widthValue; // area var still int need to convert ?



    }
}
