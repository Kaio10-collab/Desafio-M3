package com.br.zup;

/**
 * One estou calculando as pontuação que vai retornar ao finalziar o sorteio.
 * @version 0.1
 */

import java.util.Random;

public class Pontuacao {

    public void pontos() {

        int qntItens = Simbolos.values().length;
        int sorteio;
        int vrSimbolo;
        int total = 0;
        int bonus = 0;

        for (int x = 0; x < qntItens; x++) {

            sorteio = new Random().nextInt(qntItens);
            vrSimbolo = Simbolos.values()[sorteio].valor(sorteio);
            total = total + vrSimbolo;
            System.out.print(Simbolos.values()[sorteio].name() + " ");
            if (Simbolos.values()[sorteio].name() == "BANANA"){
                bonus ++;
            }
            System.out.println(vrSimbolo);
        }
        System.out.println("A pontuação foi de " + total);
        if (bonus == qntItens){
            System.out.println("Parabéns você acertou a palavra Banana 3 vezes e ganhou um bônus de "+total*100);
        }
    }
}