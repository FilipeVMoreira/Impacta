/*
[DESAFIO] Faça um programa que mostre os 10 primeiros elementos
da Sequência de Fibonacci:
1 1 2 3 5 8 13 21...
1- Criar lista para armazenar os números da sequência e adicionar os dois primeiros valores a ela
(1 e 1)
2- Criar uma variável para percorrer as posições da lista que começa com o valor 2
(terceira posição)
3- Criar um loop em que enquanto a posição for menor que 10, adiciona um valor que seja
equivalente a soma das duas posições anteriores
4- Exibir a lista
*/

import javax.swing.*;
import java.util.ArrayList;

public class ex70 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(1);
        int posicao = 2;
        while (posicao < 10){
            int num = lista.get(posicao - 1) + lista.get(posicao - 2);
            lista.add(num);
            posicao++;
        }
        JOptionPane.showMessageDialog(null, lista);
    }
}
