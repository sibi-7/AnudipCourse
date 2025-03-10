import java.util.Scanner;

class UnderAgeException extends Exception {
    public UnderAgeException(String message) {
        super(message);
    }
}

public class VotingApplication {
    
    public static void checkEligibility(int age) throws UnderAgeException {
        if (age < 18) {
            throw new UnderAgeException("Error: You are not eligible to vote! Minimum age required is 18.");
        } else {
            System.out.println("Congratulations! You are eligible to vote.");
        }
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
           
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
               
            checkEligibility(age);
            
        } catch (UnderAgeException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Thank you for using the Voting Application.");
        }
    }
}
