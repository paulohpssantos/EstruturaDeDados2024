package com.mycompany.exemplolistaduplamenteencadeada;

import java.util.ArrayList;

/**
 *
 * @author paulodossantos
 */
public class Lista<Objeto>{
    
    private Nodo<Objeto> primeiro;
    private Nodo<Objeto> ultimo;

    public Objeto getPrimeiro() {
        return primeiro.getObjeto();
    }

    public Objeto getUltimo() {
        return ultimo.getObjeto();
    }
    
    public void incluirNoFim(Objeto objeto){
        Nodo<Objeto> novoNodo = new Nodo<>(objeto);
        if(isEmpty()){
            primeiro = novoNodo;
            ultimo = novoNodo;
        }else{
            ultimo.setProximo(novoNodo);
            novoNodo.setAnterior(ultimo);
            ultimo = novoNodo;
        }
        
    }
    
    public void incluirNoInicio(Objeto objeto){
        Nodo<Objeto> novoNodo = new Nodo<>(objeto);
        if(isEmpty()){
            primeiro = novoNodo;
            ultimo = novoNodo;
        }else{
            novoNodo.setProximo(primeiro);
            primeiro.setAnterior(novoNodo);
            primeiro = novoNodo;
        }
    }
    
    public Objeto excluirDoInicio()throws ListaVaziaException{
        if(isEmpty()){
            throw new ListaVaziaException();
        }
        Objeto objExcluido = primeiro.getObjeto();
        if(primeiro == ultimo){
            primeiro = null;
            ultimo = null;
        }else{
            primeiro = primeiro.getProximo();
        }    
                    
        return objExcluido;
    }
    
    public Objeto excluirDoFim()throws ListaVaziaException{
        if(isEmpty()){
            throw new ListaVaziaException();
        }
        Objeto objExcluido = ultimo.getObjeto();
        if(primeiro == ultimo){
            primeiro = null;
            ultimo = null;
        }else{
            ultimo = ultimo.getAnterior();
        }    
                    
        return objExcluido;
    }
    
    public boolean isEmpty(){
        return primeiro == null;
    }
    
    
    
}


        