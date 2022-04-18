import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();

        Scanner input = new Scanner(System.in);

        Decode decoder = new Decode();

        BufferedReader br = null;
        String path = "";

        System.out.println("Type the String:");
        String e1 = input.next();
        

        // BufferedReader
        // change path to new testcase
        try (BufferedReader caso = new BufferedReader(new FileReader("D:/Facul/3sem/alest2/t1/caso10"))) {
            String line = caso.readLine();
            boolean isNull = line == null;

            while (!isNull) {
                try {

                    // New String Vector

                    String[] linha = line.split(" ");

                    // Adds the keys and values to subsTable

                    if (linha.length == 1) {
                        decoder.subsTable.put(linha[0], " ");
                    } else {

                        decoder.subsTable.put(linha[0], linha[1]);
                    }

                    line = caso.readLine();

                    // generates exception when null
                } catch (NullPointerException e) {
                    isNull = line == null;

                    if (!isNull) {
                        System.out.println(e.getMessage());
                        System.exit(1);
                    } else {
                        break;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        String newString = decoder.decoder(e1);

        System.out.println("\nTest Case: 10\nOriginal String: " + e1);
        System.out.println("Num of chars: " + e1.length());
        // System.out.println(newString);

        System.out.println("\nNew String Num of chars: " + newString.length());

        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("Runtime: " + time / 1000 + "s\n");
    }
}