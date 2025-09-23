import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.*;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        int rollNumber;
//        double marks;
//        String name;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Student Report System With Java Streams!");

        // Inserting Name
//        do{
//            System.out.print("Enter the student's name:");
//            name = scanner.nextLine().trim();
//
//            if(name.isEmpty()) {
//                System.out.println("Item name cannot be empty. Please enter a name.");
//            }
//        } while(name.trim().isEmpty());
//
//        // Inserting roll Number
//        do{
//            System.out.print("Enter the student's roll number: ");
//            try {
//                rollNumber = scanner.nextInt();
//                scanner.nextLine();
//                break;
//            } catch (InputMismatchException e) {
//                System.out.println("Invalid Input. Please student's roll number: ");
//                scanner.nextLine();
//            }
//        } while(true);
//
//        // Inserting marks
//        do{
//            System.out.print("Enter the student's marks: ");
//            try {
//                marks = scanner.nextDouble();
//                scanner.nextLine();
//                break;
//            } catch (InputMismatchException e) {
//                System.out.println("Invalid Input. Please student's marks: ");
//                scanner.nextLine();
//            }
//        } while(true);
//
//        System.out.println();

//        try{
//            FileOutputStream writer = new FileOutputStream("writtingExample.txt", true);
//            writer.write("Steve\t222012822\t92.0\n".getBytes());   //Here you can say variable_name.getBytes to write to file
//            writer.close();
//        }catch(Exception e){
//            System.out.println("Something went wrong!");
//        }

        try {
            // Load the image into a BufferedImage
            File file = new File("C:\\Users\\nnico\\Downloads\\loanProofBRD.png");
            BufferedImage image = ImageIO.read(file);

            // Create a label to hold the image
            JLabel label = new JLabel(new ImageIcon(image));

            // Create a JFrame to display it
            JFrame frame = new JFrame("View PNG Image");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(label);
            frame.pack(); // adjusts frame size to fit the image
            frame.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
        }

//        scanner.close();
    }
}