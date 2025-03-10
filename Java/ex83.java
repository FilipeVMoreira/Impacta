/*
[DESAFIO] Crie uma lógica que preencha um vetor de 20 posições
com números aleatórios (entre 0 e 99) gerados pelo computador.
Logo em seguida, mostre os números gerados e depois coloque o
vetor em ordem crescente, mostrando no final os valores ordenados.
1- Criar lista vazia para adicionar os valores
2- Criar um loop em que para cada índice de 0 à 19, adiciona a lista um valor aleatório
3- Exibir a lista
4- Usar o comando sort para ordenar a lista
5- Exibir a lista ordenada
*/

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ex83 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            lista.add(random.nextInt(100));
        }
        JOptionPane.showMessageDialog(null,"Lista desordenada: " + lista);
        Collections.sort(lista);
        JOptionPane.showMessageDialog(null,"Lista ordenada: " + lista);

    }
}
