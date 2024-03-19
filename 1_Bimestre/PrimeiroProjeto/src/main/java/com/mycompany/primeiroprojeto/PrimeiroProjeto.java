/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeiroprojeto;

import javax.swing.JOptionPane;

/**
 *
 * @author paulodossantos
 */
public class PrimeiroProjeto {

    public static void main(String[] args) {
        
        String teste = "p";
        int numero = 0;
        float numeroDecimal =  0.0f;
        double numDecimal = 0.0;
        boolean trueFalse = true;
        char letra = 'p';
        
        numDecimal = 25;
        
//        == -> comparação
//        =! -> diferente que
//        >
//        <
//        
//        && => e
//        || => ou   

        String mdAluno = 
                JOptionPane.showInputDialog(
                        "Informe a média do Aluno:");
        double media = Double.parseDouble(mdAluno);
        if( media >= 6.0 ){
            JOptionPane.
                    showMessageDialog(
                            null,
                            "O Aluno está APROVADO!");
        }else{
            JOptionPane.
                    showMessageDialog(
                            null, 
                            "O Aluno está REPROVADO!!");
        }
        
    }
}
