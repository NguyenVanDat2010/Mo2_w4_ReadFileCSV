import java.io.*;

public class ReadFileCSV {
    public static void main(String[] args) {
        try {
//            BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("country.csv"));
            String csvFile = "country.csv";
            String line = "";
            String cvsSplitBy = ",";
            BufferedReader bufferedReader = new BufferedReader(new FileReader(csvFile));
            while ((line = bufferedReader.readLine()) != null) {
                String[] country = line.split(cvsSplitBy);
                System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
