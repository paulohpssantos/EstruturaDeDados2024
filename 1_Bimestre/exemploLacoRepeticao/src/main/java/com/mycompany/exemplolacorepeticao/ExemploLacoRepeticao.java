package com.mycompany.exemplolacorepeticao;

import javax.swing.JOptionPane;

/**
 *
 * @author paulodossantos
 */
public class ExemploLacoRepeticao {

    public static void main(String[] args) {
        
        String[]vetorNomes = new String[5];
        vetorNomes[0] = "Juca";
        vetorNomes[1] = "Maria";
        vetorNomes[2] = "José";
        vetorNomes[3] = "Fulano";
        vetorNomes[4] = "Ciclano"; 
        
        /*1- instanciar variavel controlador,
             onde irá começar o laço
          2- até onde irá executar,
          3- incremento do controle*/  
        for(int i = 0; i < vetorNomes.length; i++){
            System.out.println("Nome: "+vetorNomes[i]);
        }
        
        int cont = 0;
        while(cont < vetorNomes.length){
            System.out.println("Nome: "+vetorNomes[cont]);
            cont++;
        }
        
       String nome;
       int indice = 0;
       do{
         nome = vetorNomes[indice];
         System.out.println("Nome: "+vetorNomes[indice]);
         indice++;
       }while(!nome.equals("Fulano"));
        
       
    }
}
