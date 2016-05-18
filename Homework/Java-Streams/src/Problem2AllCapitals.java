import java.io.*;

public class Problem2AllCapitals {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader(new File("library/lines.txt")))) {
            String line;
            FileWriter fw = new FileWriter(new File("library/upper_lines.txt"));
            PrintWriter printWriter = new PrintWriter(fw);
            while ((line=br.readLine())!=null){
                line = line.toUpperCase();
                printWriter.println(line);
            }
            fw.flush();
            fw.close();

        }catch (IOException ex){
            System.out.println("Try again!");
        }
    }
}
