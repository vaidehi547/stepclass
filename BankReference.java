import java.util.Scanner;

public class BankReference {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter reference: ");
        String ref = sc.nextLine();

        // Remove spaces
        ref = ref.trim();

        // Convert first 3 characters to uppercase
        ref = ref.substring(0, 3).toUpperCase()
                + ref.substring(3);

        // Check length
        if (ref.length() != 14) {
            System.out.println("Invalid: wrong length");
            return;
        }

        // Check first 3 characters are letters
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(ref.charAt(i))) {
                System.out.println("Invalid: bank code must be 3 letters");
                return;
            }
        }

        // Check remaining characters are digits
        for (int i = 3; i < 14; i++) {
            if (!Character.isDigit(ref.charAt(i))) {
                System.out.println("Invalid: body must contain digits");
                return;
            }
        }

        String bank = ref.substring(0, 3);
        String date = ref.substring(3, 9);
        String seq = ref.substring(9);

        System.out.println("[" + bank + "] DATE: "
                + date.substring(0, 2) + "/"
                + date.substring(2, 4) + "/"
                + date.substring(4, 6)
                + " | SEQ: " + seq);
    }
}