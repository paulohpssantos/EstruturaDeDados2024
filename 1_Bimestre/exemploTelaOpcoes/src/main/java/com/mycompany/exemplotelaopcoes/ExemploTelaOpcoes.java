package com.mycompany.exemplotelaopcoes;

import javax.swing.JOptionPane;

/**
 *
 * @author paulodossantos
 */
public class ExemploTelaOpcoes {

    public static void main(String[] args) {
        
        int opcao = -1;
        do{
            opcao = Integer.parseInt(JOptionPane.
                    showInputDialog("Selecione uma opção:\n"
                            + "1 - Opção 1\n"
                            + "2 - Opção 2\n"
                            + "3 - Opção 3\n"
                            + "0 - Sair"));
            
            if(opcao == 1){
               executaOpcao01();
            }
            
            
        }while(opcao != 0);
    }
    
    public static void executaOpcao02(){
        
    }
    
    
    
    
    public static void executaOpcao01(){
        JOptionPane.
                showMessageDialog(null, 
                        "Você selecionou a opção 1!!!");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
