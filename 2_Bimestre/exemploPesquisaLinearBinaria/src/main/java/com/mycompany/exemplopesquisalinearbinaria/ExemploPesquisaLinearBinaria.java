package com.mycompany.exemplopesquisalinearbinaria;

import javax.swing.JOptionPane;

/**
 *
 * @author paulodossantos
 */
public class ExemploPesquisaLinearBinaria {
    
    static long tempoInicialLinear, tempoFinalLinear;
    static long tempoInicialBinario, tempoFinalBinario;

    public static void main(String[] args) {
        
        long quantidade = 100000000;
        long[] vetor = new long[(int)quantidade];
        int chave = 259000;
        
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * quantidade);
        }
        
        int posicaoEncontradaLinear = pesquisaLinear(chave, vetor);
        tempoFinalLinear = System.currentTimeMillis();
        
        int posicaoEncontradaBinaria = pesquisaBinaria(chave, vetor);
        tempoFinalBinario = System.currentTimeMillis();
        
//        JOptionPane.showMessageDialog(null, 
//                "O elemento está na posicão: "+
//                        posicaoEncontrada);

         JOptionPane.showMessageDialog(null, 
                 "A pesquisa Linear executou em: ("+(tempoFinalLinear - tempoInicialLinear)+")"
               + "\n A pesquisa Binária executou em: ("+(tempoFinalBinario - tempoInicialBinario)+")");
        
        
        
    }
    
    public static int pesquisaLinear(int numPesq, long[]vetor){
        
        tempoInicialLinear = System.currentTimeMillis();
        
        for(int i = 0; i < vetor.length; i++){
            if(numPesq == vetor[i]){
                return i;
            }
        }
        
        return -1;
    }
    
    public static int pesquisaBinaria(int numPesq, long[]vet){
        
        tempoInicialBinario = System.currentTimeMillis();
        int esquerda, meio, direita; 
        esquerda = 0;
        direita = vet.length -1;
        
        while(esquerda <= direita){
            
            meio = (esquerda + direita)/2;
            if(numPesq == vet[meio]){
                return meio;
            }
            if(numPesq > vet[meio]){
                esquerda = meio+1;
            }else{
                direita = meio-1;
            }
            
        }
        
        return -1;
    }
}
