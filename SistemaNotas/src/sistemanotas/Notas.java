/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemanotas;

/**
 *
 * @author Francisco Antonio
 */
public class Notas {
    double Ac1;
    double Ac2;
    double Ac3;
    String nome;
    
    void media (){
        double media = this.Ac1 + this.Ac2 + this.Ac3;
        media = media/3;
        
        if (media < 70.00) {
            System.out.println("O aluno " + nome + " foi reprovado");
            System.out.println("Media de: " + media);
        } else {
            System.out.println("O aluno " + nome + " foi aprovado");
            System.out.println("Media é: " + media);
        }
        
    }
}
