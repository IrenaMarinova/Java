import java.io.*;

public class Problem1SumLines {
    public static void main(String[] args) {


        try (BufferedReader br = new BufferedReader(new FileReader(new File("library/lines.txt")))) {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                int lineSum = 0;
                for (int i = 0; i < line.length(); i++) {
                    lineSum += line.charAt(i);
                }
                System.out.println(lineSum);
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found!");

        } catch (IOException ex) {
            System.out.println("Please, try again!");
        }
    }
}
