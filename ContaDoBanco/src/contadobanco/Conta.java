
package contadobanco;

public class Conta {
    int numero;
    private String titular;
    private double saldo;
    
    
    boolean saca(double quantidade){
        
        if(this.saldo <= quantidade){
            System.out.println("Saldo Insuficiente");
            return false;
        }
        else {
            
            System.out.println("O valor do Saque: " + quantidade);
            this.saldo = this.saldo - quantidade;
            return true;
        }
    }
    
    void deposita(double quantidade){
       
 System.out.println("O valor do Deposito: " + quantidade);
        double novoSaldo;
        novoSaldo = this.saldo + quantidade;
        this.saldo = novoSaldo;
    }
    public double pegaSaldo(){
        return this.saldo;
    }
    public void mudarSaldo(double saldo){
        this.saldo = saldo;
    }
    public String pegaTitular(){
        return this.titular;
    }
    public void mudarTitular(String titular){
        this.titular = titular;
    }
}
