import java.util.Scanner;


class Student {
    int id;
    String name;
    int age;


    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }
}


public class StudentRecords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[10]; 

        try {
           
            for (int i = 0; i < 10; i++) {
                System.out.println("Enter details for Student " + (i + 1) + ": ");
                System.out.print("Enter ID: ");
                int id = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Age: ");
                int age = scanner.nextInt();

            
                students[i] = new Student(id, name, age);
            }

            
            System.out.println("\nTrying to access index 12...");
            students[12].display();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Attempted to access an invalid index in the array!");
        } finally {
            System.out.println("\nStored Student Records:");
            for (int i = 0; i < 10; i++) {
                students[i].display(); 
            }
            scanner.close();
        }
    }
}
