package J12;
import java.util.Scanner;
public class LoanEligibilityCheck {
	public static void checkEligibility(String location, int age) throws InvalidLocationException, InvalidAgeException {
        
        String[] validLocations = {"Chennai", "Mumbai", "Delhi", "Kolkata"};
        boolean isValidLocation = false;
        for (String city : validLocations) {
            if (city.equalsIgnoreCase(location)) {
                isValidLocation = true;
                break;
            }
        }

        if (!isValidLocation) {
            throw new InvalidLocationException("Invalid location. Loan is only available for Chennai, Mumbai, Delhi, or Kolkata.");
        }

        
        if (age < 18) {
            throw new InvalidAgeException("Invalid age. Age must be at least 18 for loan eligibility.");
        }
        System.out.println("You are eligible for the loan.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            
            System.out.print("Enter your location: ");
            String location = scanner.nextLine();

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            checkEligibility(location, age);

        } catch (InvalidLocationException |InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        scanner.close();
    }
}
