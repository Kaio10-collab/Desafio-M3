package com.br.zup;

/**
 * Definição dos símbolos do jogo.
 */

public enum Simbolos {

    BANANA (10),
    MORANGO(20),
    ESTRELA(40);

    public int ponto;

    Simbolos(int i) { this.ponto = i; }

    public int valor(int i){ return ponto;}

}