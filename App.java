import java.util.*;
import java.io.*;

public class App{
    public static void main(String[] args) throws IOException{
        BufferedReader br = null;

        String line;

        try {
            br = new BufferedReader(new FileReader("D:/Facul/3sem/alest2/t1/caso02"));
            line = br.readLine();
            String[] aux = line.split("");
            String letraInicial = aux[0];

            while((line = br.readLine()) != null){
            }


            System.out.println(letraInicial);

        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}