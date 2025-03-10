import java.util.Scanner;
abstract class Vaccine {
    int age;
    String nationality;
    boolean firstDoseTaken = false; 
    boolean secondDoseTaken = false; 

   
    public Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

    
    public void firstDose() {
        if (age >= 18 && nationality.equalsIgnoreCase("Indian")) {
            firstDoseTaken = true;
            System.out.println("First dose completed!");
        } else {
            System.out.println("You are not eligible for the first dose.");
        }
    }

    public void secondDose() {
        if (firstDoseTaken) {
            secondDoseTaken = true;
            System.out.println("Second dose completed!");
        } else {
            System.out.println("You need to take the first dose");
        }
    }

    
    @SuppressWarnings("unused")
    abstract void boosterDose();
}


class VaccinationSuccessful extends Vaccine {
    
    public VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }


    @Override
    void boosterDose() {
        if (secondDoseTaken) {
            System.out.println("Booster dose completed!");
        } else {
            System.out.println("You need to complete the second dose");
        }
    }
}


public class Vaccination {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter your nationality: ");
        String nationality = scanner.nextLine();
      
        VaccinationSuccessful person = new VaccinationSuccessful(age, nationality);
       
        person.firstDose();
        person.secondDose();
        person.boosterDose();

        scanner.close();
    }
}
