import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String filename = args[0];

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));

            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                sb.append(line);

                line = br.readLine();
            }
            String everything = sb.toString();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
