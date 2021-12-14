/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadobanco;


public class Cliente {
    private String nome;
    private String endereco;
    private int idade;
    private String cpf;
    
    public void mudacpf(String cpf){
        if(idade <= 60){
            valida(cpf);
        }
        this.cpf = cpf;
    }

    private void valida(String cpf) {
        
    }
}
