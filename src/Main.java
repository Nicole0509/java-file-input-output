import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int rollNumber;
        double marks;
        String name;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Student Report System With Java Streams!");

        // Inserting Name
        do{
            System.out.print("Enter the student's name:");
            name = scanner.nextLine().trim();

            if(name.isEmpty()) {
                System.out.println("Item name cannot be empty. Please enter a name.");
            }
        } while(name.trim().isEmpty());

        // Inserting roll Number
        do{
            System.out.print("Enter the student's roll number: ");
            try {
                rollNumber = scanner.nextInt();
                scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input. Please student's roll number: ");
                scanner.nextLine();
            }
        } while(true);

        // Inserting marks
        do{
            System.out.print("Enter the student's marks: ");
            try {
                marks = scanner.nextDouble();
                scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input. Please student's marks: ");
                scanner.nextLine();
            }
        } while(true);

        System.out.println();

        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("writtingExample.txt", true));
            writer.write(name + "\t" + rollNumber + "\t" + marks + "\n" );
            writer.close();
        }catch(Exception e){
            System.out.println("Something went wrong!");
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("writtingExample.txt"));

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        }catch(Exception e){
            System.out.println("Something went wrong!");
        }

        scanner.close();
    }
}