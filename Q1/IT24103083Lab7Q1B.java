import java.util.Scanner;

public class IT24103083Lab7Q1B{
    public static void main(String[] args) {
          
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter the marks for Student " + i + " (4 subjects separated by space):");
            System.out.print("Enter marks: ");
            
           
            int subject1 = scanner.nextInt();
            int subject2 = scanner.nextInt();
            int subject3 = scanner.nextInt();
            int subject4 = scanner.nextInt();

            
            double average = (subject1 + subject2 + subject3 + subject4) / 4.0;

           
            if (average >= 75 && average <= 100) {
                System.out.println("Overall Grade  " + i + " is: Distinction");
            } else if (average >= 50 && average <= 75) {
                System.out.println("Overall Grade  " + i + " is: Credit");
            } else if (average >= 0 && average <= 50) {
                System.out.println("Overall Grade " + i + " is: Fail");
            } else {
                System.out.println("Invalid average");
            }
        }

        
    }
}