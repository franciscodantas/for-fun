
package criadordetexto;
import java.util.Scanner;

public class CriadorDeTexto {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner frase = new Scanner(System.in);
        String str;
        System.out.println("Digite alguma coisa: ");
        str = frase.nextLine();
        Scanner local = new Scanner(System.in);
        String str2;
        System.out.println("Digite o local que o arquivo vai ser salvo: ");
        str2 = local.nextLine();
        CriadorDeArquivo.escreverTexto(str2, str);
    }
    
}
