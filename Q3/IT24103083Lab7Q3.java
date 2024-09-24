import java.util.Scanner;

public class IT24103083Lab7Q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double DISCOUNT_RATE = 0.05; 
        final int CUSTOMER_COUNT = 5;

        for (int i = 1; i <= CUSTOMER_COUNT; i++) {
            System.out.println("Enter total bill amount for customer " + i + ": ");
            double billAmount = scanner.nextDouble();

            System.out.println("Enter payment mode for customer " + i + " (C/c for Cash, O/o for Other): ");
            char paymentMode = scanner.next().charAt(0);

            if (paymentMode == 'C' || paymentMode == 'c') {
                
                double discount = billAmount * DISCOUNT_RATE;
                double amountToBePaid = billAmount - discount;
                System.out.println("Discount: $" + discount);
                System.out.println("Amount to be paid: $" + amountToBePaid);
            } else if (paymentMode == 'O' || paymentMode == 'o') {
           
                System.out.println("No discount applied.");
                System.out.println("Amount to be paid: $" + billAmount);
            } else {
                
                System.out.println("Payment Mode is Not Valid.");
            }
            System.out.println();
        }

        scanner.close();
    }
}