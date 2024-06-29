import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take age input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Take nationality input
        System.out.print("Enter your nationality: ");
        String nationality = scanner.next();

        // Check eligibility
        if (age >= 18 && nationality.equalsIgnoreCase("Indian")) {
            System.out.println("You are eligible to vote in India.");
        } else {
            System.out.println("You are not eligible to vote in India.");
        }

        scanner.close();
    }
}
