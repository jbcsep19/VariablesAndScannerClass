import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args){
        int num = 5;

        String name = "Vic";
        String name2 = new String("Vic");

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a number");
        int myNumber = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Enter a String: ");
        String myAnswer = keyboard.nextLine();

        System.out.println("Your string: " + myAnswer);
        System.out.println("Your number: " + myNumber);

    }
}