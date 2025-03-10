import java.util.Scanner;

class Animal {
  
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}


class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }
}


public class AnimalSoundDemo {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Choose an animal: 1 for Dog, 2 for Cat");
        int choice = scanner.nextInt();

        
        Animal animal;
        animal = switch (choice) {
            case 1 -> new Dog();
            case 2 -> new Cat();
            default -> new Animal();
        };

        
        animal.makeSound();

        scanner.close();
    }
}
