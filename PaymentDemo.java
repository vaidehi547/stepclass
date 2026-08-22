import java.util.Scanner;

abstract class Payment {
    abstract void makePayment(double amount);
}

class UPI extends Payment {
    @Override
    void makePayment(double amount) {
        System.out.println("Payment of Rs." + amount + " made using UPI.");
    }
}

class CreditCard extends Payment {
    @Override
    void makePayment(double amount) {
        System.out.println("Payment of Rs." + amount + " made using Credit Card.");
    }
}

class NetBanking extends Payment {
    @Override
    void makePayment(double amount) {
        System.out.println("Payment of Rs." + amount + " made using Net Banking.");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. UPI");
        System.out.println("2. Credit Card");
        System.out.println("3. Net Banking");

        System.out.print("Select payment method: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        Payment payment;

        if (choice == 1) {
            payment = new UPI();
        } else if (choice == 2) {
            payment = new CreditCard();
        } else if (choice == 3) {
            payment = new NetBanking();
        } else {
            System.out.println("Invalid choice");
            return;
        }

        payment.makePayment(amount);
    }
}