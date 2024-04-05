
package com.mycompany.ordenacaoinsercao;

import javax.swing.JOptionPane;

/**
 *
 * @author paulodossantos
 */
public class OrdenacaoInsercao {
    
    public static void main(String[] args) {
        
        int vetor[] = {30,20,10,40};
        int chave;  // armazena o valor a ser comparado
        int j;  // indice do segundo laço
        
        for(int i = 1; i < vetor.length; i++){
            chave = vetor[i];
            
            for(j = i - 1; 
                    (j >= 0 && vetor[j] > chave); j--){
                
                vetor[j+1] = vetor[j];
            }
            vetor[j+1] = chave;
        }
        
        
        String msg = "";
        for (int i = 0; i < vetor.length; i++) {
            msg += vetor[i];
            if(i < vetor.length-1)
                msg += " - ";
        }
        JOptionPane.showMessageDialog(null,
                "VETOR ORDENADO: "+msg);
        
    }
}
