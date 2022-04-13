import java.io.*;
import java.util.*;

public class Decodificador {
    
    public static void algoritimoenzo() {
        String caso = "caso01";
        String letratransformada = " ";
        String letra = " ";
        try (BufferedReader br = new BufferedReader(new FileReader(caso))) {
            String line = br.readLine();// cria a variavel line que le a 1 linha que contem apenas variaveis
            List<abedecario> casos = new ArrayList<abedecario>();
           
            while (line != null) { // cria um while para rodar todo o programa
                String[] vect = line.split(" ");
                letra = vect[0]; 
                letratransformada = vect[1];   
                line = br.readLine();
                abedecario ab = new abedecario(letra, letratransformada);
                casos.add(ab);

         }
           

        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        }

    } // excepion do catch e imprime uma mensagem de erro e o motivo dele


}
