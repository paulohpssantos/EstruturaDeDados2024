package com.mycompany.exemplolistaduplamenteencadeada;

import java.util.ArrayList;

/**
 *
 * @author paulodossantos
 */
public class Nodo<Objeto> {
    
    private Objeto objeto;
    private Nodo<Objeto> anterior;
    private Nodo<Objeto> proximo;

    public Nodo(Objeto objeto) {
        this.objeto = objeto;
    }
    
    public Objeto getObjeto(){
        return objeto;
    }    
    
    public Nodo<Objeto>getAnterior(){
        return anterior;
    } 
    
    public Nodo<Objeto>getProximo(){
        return proximo;
    }
    
    public void setAnterior(Nodo<Objeto> anterior){
        this.anterior = anterior;
    }
    
    public void setProximo(Nodo<Objeto> proximo){
        this.proximo = proximo;
    }
    
    
    
}
