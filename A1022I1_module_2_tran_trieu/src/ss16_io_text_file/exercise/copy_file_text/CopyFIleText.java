package ss16_io_text_file.exercise.copy_file_text;


import java.io.*;
import java.util.Scanner;

public class CopyFIleText {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter source file:");
            File sourceFile = new File(scanner.nextLine());
            System.out.print("Enter dest file:");
            File destFile = new File(scanner.nextLine());
            BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(destFile));

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            reader.close();
            writer.close();
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
