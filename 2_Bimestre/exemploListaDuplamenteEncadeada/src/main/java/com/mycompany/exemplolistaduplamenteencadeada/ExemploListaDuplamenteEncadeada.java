package com.mycompany.exemplolistaduplamenteencadeada;

import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author paulodossantos
 */
public class ExemploListaDuplamenteEncadeada {
    
    

    public static void main(String[] args) throws ListaVaziaException {
        Lista<String> lista = new Lista<>();
        
        while(true){
            String str = 
                    JOptionPane.showInputDialog("Informe um nome");
            if(str == null){
                break;
            }
            lista.incluirNoFim(str);
        }
        
        String mensagem = "Itens da lista: ";
        while(!lista.isEmpty()){
            mensagem += "\n"+ lista.excluirDoInicio();
        }
        JOptionPane.showMessageDialog(null, mensagem);
        
                
        
        
    }
}
