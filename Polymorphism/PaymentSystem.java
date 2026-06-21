import java.util.Scanner;

class Payment {

    void pay() {
        System.out.println("Processing payment");
    }
}

class CreditCardPayment extends Payment {

    @Override
    void pay() {
        System.out.println("Payment completed using Credit Card");
    }
}

class UpiPayment extends Payment {

    @Override
    void pay() {
        System.out.println("Payment completed using UPI");
    }
}

class NetBankingPayment extends Payment {

    @Override
    void pay() {
        System.out.println("Payment completed using Net Banking");
    }
}

public class PaymentSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select Payment Method");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.println("3. Net Banking");

        int choice = sc.nextInt();

        Payment payment;

        switch(choice) {

            case 1:
                payment = new CreditCardPayment();
                break;

            case 2:
                payment = new UpiPayment();
                break;

            case 3:
                payment = new NetBankingPayment();
                break;

            default:
                System.out.println("Invalid Choice");
                return;
        }

        payment.pay();
    }
}