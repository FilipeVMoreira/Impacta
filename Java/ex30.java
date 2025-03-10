/*
[DESAFIO] Refaça o algoritmo 25, acrescentando o recurso de
mostrar que tipo de triângulo será formado:
• EQUILÁTERO: todos os lados iguais
• ISÓSCELES: dois lados iguais
• ESCALENO: todos os lados diferentes
1- Receber 3 entradas de números (linha1, linha2, linha3)
2- Acrescentar a condição de que se a soma entre 2 deles for maior que o valor do outro
(considerando todos os lados), essa linhas podem formar um triângulo, caso contrário, não podem.
3- Dentro da condição da soma entre eles acrescentar outra condições que separarão o triângulo
entre os 3 tipos. 
*/

import javax.swing.*;

public class ex30 {
    public static void main(String[] args) {
        String linha1 = JOptionPane.showInputDialog("Escreva o tamanho da primeira linha: ");
        String linha2 = JOptionPane.showInputDialog("Escreva o tamanho da segunda linha: ");
        String linha3 = JOptionPane.showInputDialog("Escreva o tamanho da terceira linha: ");
        int valor1 = Integer.parseInt(linha1);
        int valor2 = Integer.parseInt(linha2);
        int valor3 = Integer.parseInt(linha3);

        if (valor1 + valor2 > valor3 && valor1 + valor3 > valor2 && valor2 + valor3 > valor1) {
            JOptionPane.showMessageDialog(null, "Essas linhas podem formar um triângulo");
            if(valor1 == valor2 && valor2 == valor3) {
                JOptionPane.showMessageDialog(null, "O triângulo formado é equilátero!!");
            }
            else if (valor1 == valor2 || valor1 == valor3 || valor2 == valor3) {
                JOptionPane.showMessageDialog(null, "O triângulo formado é isóceles!!");
            }
            else {
                JOptionPane.showMessageDialog(null, "O triângulo formado é escaleno!!");
            }
            }
        else {
            JOptionPane.showMessageDialog(null, "Essas linhas não podem formar um triângulo");

        }
    }
}
