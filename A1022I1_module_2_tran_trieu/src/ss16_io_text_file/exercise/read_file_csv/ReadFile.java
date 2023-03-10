package ss16_io_text_file.exercise.read_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    public static final String FILE_PATH = "D:\\CodeGym\\module_2\\A1022I1_module_2\\A1022I1_module_2_tran_trieu\\src\\ss16_io_text_file\\exercise\\ex2_read_file_csv\\country.csv";

    public static List<Country> ReaderFileCSV() {
        try {
            FileReader fileReader = new FileReader(FILE_PATH);
            BufferedReader buff = new BufferedReader(fileReader);
            List<Country> countryList = new ArrayList<>();
            String line = "";
            String temp[];
            Country country;
            while ((line = buff.readLine()) != null) {
                temp = line.split(",");
                int id = Integer.parseInt(temp[0]);
                String code = temp[1];
                String name = temp[2];
                country = new Country(id, name, code);
                countryList.add(country);
            }
            buff.close();
            return countryList;
        } catch (IOException | NumberFormatException | NullPointerException e) {
            e.printStackTrace();
        } finally {
            System.out.println("End program!");
        }
        return null;
    }

    public static void main(String[] args) {
        List<Country> countryList = ReaderFileCSV();
        for (Country country : countryList) {
            System.out.println(country);
        }
    }
}
