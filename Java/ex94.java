/*
[DESAFIO] Desenvolva um aplicativo que tenha um procedimento
chamado Fibonacci() que recebe um único valor inteiro como
parâmetro, indicando quantos termos da sequência serão mostrados
na tela. O seu procedimento deve receber esse valor e mostrar a
quantidade de elementos solicitados.
Obs: Use os exercícios 70 e 75 para te ajudar
na solução Ex:
Fibonacci(5) vai gerar 1 &gt;&gt; 1 &gt;&gt; 2 &gt;&gt; 3 &gt;&gt; 5 &gt;&gt; FIM
Fibonacci(9) vai gerar 1 &gt;&gt; 1 &gt;&gt; 2 &gt;&gt; 3 &gt;&gt; 5 &gt;&gt; 8 &gt;&gt; 13 &gt;&gt; 21 &gt;&gt; 34
&gt;&gt; FIM
1- Criar o protocolo Fibonacci com um número inteiro de parâmetro
2- Criar uma lista e adicionar a ela os dois primeiros valores (1 e 1)
3- Criar uma variável para percorrer as posições da lista que começa com o valor 2
(terceira posição)
4- Criar um loop em que enquanto a posição for menor que n, adiciona um valor que seja
equivalente a soma das duas posições anteriores
5- Exibir a lista
6- Adicionar a chamada ao protocolo na main

*/

import javax.swing.*;
import java.util.ArrayList;

public class ex94 {
    public static void Fibonacci(int n) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(1);
        int posicao = 2;
        while (posicao < n) {
            int num = lista.get(posicao - 1) + lista.get(posicao - 2);
            lista.add(num);
            posicao++;
        }
        JOptionPane.showMessageDialog(null,"Fibonacci(" + n + ") vai gerar: " + lista);

    }
    public static void main(String[] args) {
        String tamanho = JOptionPane.showInputDialog("Qual será o tamanho da sua sequência de fibonnacci?");
        int n = Integer.parseInt(tamanho);
        Fibonacci(n);

    }
}
