import java.io.*;
import java.util.*;

public class Decodificador {
    
    public static void algoritimoenzo() {
        String caso = "caso01";
        try (BufferedReader br = new BufferedReader(new FileReader(caso))) {
            String line = br.readLine();// cria a variavel line que le a 1 linha que contem apenas variaveis
            List<abedecario> casos = new ArrayList<abedecario>();
            String letratransformada = " ";
            while (line != null) { // cria um while para rodar todo o programa
                String[] vect = line.split(" ");
                String letra = vect[0];
                if(vect[1] != null){
                 letratransformada = vect[1];
                    }else{
                        line = br.readLine();
                    }
                abedecario ab = new abedecario(letra, letratransformada);
                casos.add(ab);
                line = br.readLine();

            }

            for (int i = 0; i < caso.length(); i++) {
        //        if (casos.get(i).getLetra() == "a") {
                //    escrever("saida1.txt", casos.get(i).getLetratransformada());
          //      }
            }

        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        }

    } // excepion do catch e imprime uma mensagem de erro e o motivo dele


}
