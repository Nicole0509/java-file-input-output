import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Student Report System With Java Streams!");
        System.out.print("Enter the student's name:");
        String name = scanner.nextLine();

        System.out.print("Enter the student's roll number:");
        int rollNumber = scanner.nextInt();

        System.out.print("Enter the student's marks:");
        double marks = scanner.nextDouble();

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