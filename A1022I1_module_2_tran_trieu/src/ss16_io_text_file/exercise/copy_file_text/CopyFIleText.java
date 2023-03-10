package ss16_io_text_file.exercise.copy_file_text;


import java.io.*;

public class CopyFIleText {

    public static final String FILE_SOURCE = "D:\\CodeGym\\module_2\\A1022I1_module_2\\A1022I1_module_2_tran_trieu\\src\\ss16_io_text_file\\exercise\\source\\file.txt";
    public static final String FILE_DEST = "D:\\CodeGym\\module_2\\A1022I1_module_2\\A1022I1_module_2_tran_trieu\\src\\ss16_io_text_file\\exercise\\destination\\file.txt";

    public static void main(String[] args) {
        try {
            File sourceFile = new File(FILE_SOURCE);
            File destFile = new File(FILE_DEST);
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
