
package contadobanco;

public class ContaDoBanco {

 
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.numero = 0;
        
        conta1.mudarTitular("Chico");
        System.out.println("Titular é: " + conta1.pegaTitular());
        
        conta1.mudarSaldo(1000.00);
        System.out.println("\n" + "Sistema Bancário SESI");
        
        System.out.println("Saldo: " + conta1.pegaSaldo());
    }
    
}
