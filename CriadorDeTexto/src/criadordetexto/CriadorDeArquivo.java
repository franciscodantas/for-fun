package criadordetexto;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;

public class CriadorDeArquivo {
    public static void escreverTexto ( String Caminhoarquivo, String texto){
        try(
              FileWriter criadordeArquivos = new FileWriter(Caminhoarquivo, true);
              BufferedWriter buffer = new BufferedWriter(criadordeArquivos);
              PrintWriter escritor = new PrintWriter(buffer);
              
                ){
            
            escritor.append(texto);
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
