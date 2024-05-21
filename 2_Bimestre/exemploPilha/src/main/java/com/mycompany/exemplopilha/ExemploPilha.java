/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplopilha;

import javax.swing.JOptionPane;

/**
 *
 * @author paulodossantos
 */
public class ExemploPilha {
    
    public static void main(String[] args) {
        
        Pilha<String> pilha = new Pilha<>(10);
        
        while(!pilha.isFull()){
            String elemento = 
                    JOptionPane.showInputDialog(
                            "Informe o elemento a ser adicionado:");
            if(elemento != null){
                pilha.push(elemento);
            }
        }
        
        String dadosPilha = "Itens da Pilha: ";
        while(!pilha.isEmpty()){
            dadosPilha += "\n"+pilha.pop();
        }
        
        System.out.println(dadosPilha);
                
        
        
    }
}
