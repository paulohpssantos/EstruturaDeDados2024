
package com.mycompany.exemplopilha;

/**
 *
 * @author paulodossantos
 */
public class Pilha<String> {
    
    private String[]pilha;
    private int posicaoTopo;
    
    public Pilha(int tamanho){
        pilha = (String[]) new Object[tamanho];
        posicaoTopo = -1;
    }
    
    //Adiciono elementos a pilha
    public void push(String elemento){
        pilha[++posicaoTopo] = elemento;
    }
    
    //Remove elemento da pilha
    public String pop(){
        return pilha[posicaoTopo--];
    }
    
    //Retorna o elemento que está no topo
    public String top(){
        return pilha[posicaoTopo];
    }
    //Retorna true se está vazio
    public boolean isEmpty(){
        return posicaoTopo == -1;
    }
    
    //Retorna true se estiver cheio
    public boolean isFull(){
        return posicaoTopo == pilha.length-1;
    }
    
}
