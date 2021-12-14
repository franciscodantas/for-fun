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
public class SistemaNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Notas Aluno;
        Aluno = new Notas();
        
        Notas Aluno2 = new Notas();
        
        Aluno2.Ac1 = 100.00;
        Aluno2.Ac2 = 100.00;
        Aluno2.Ac3 = 100.00;
        Aluno2.nome = "Guilherme";
        
        Aluno.Ac1 = 80.00;
        Aluno.Ac2 = 60.00;
        Aluno.Ac3 = 60.00;
        Aluno.nome = "Francisco";
        
        Aluno.media();
        Aluno2.media();
        
    }
    
}
