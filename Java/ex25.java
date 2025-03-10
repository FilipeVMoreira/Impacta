/* [DESAFIO] Crie um programa que leia o tamanho de três segmentos
de reta. Analise seus comprimentos e diga se é possível formar um
triângulo com essas retas. Matematicamente, para três segmentos
formarem um triângulo, o comprimento de cada lado deve ser menor
que a soma dos outros dois.
1- Receber 3 entradas de números (linha1, linha2, linha3)
2- Acrescentar a condição de que se a soma entre 2 deles for maior que o valor do outro
(considerando todos os lados), essa linhas podem formar um triângulo, caso contrário, não podem.
*/

import javax.swing.*;

public class ex25 {
    public static void main(String[] args) {
        String linha1 = JOptionPane.showInputDialog("Escreva o tamanho da primeira linha: ");
        String linha2 = JOptionPane.showInputDialog("Escreva o tamanho da segunda linha: ");
        String linha3 = JOptionPane.showInputDialog("Escreva o tamanho da terceira linha: ");
        int valor1 = Integer.parseInt(linha1);
        int valor2 = Integer.parseInt(linha2);
        int valor3 = Integer.parseInt(linha3);

        if (valor1 + valor2 > valor3 && valor1 + valor3 > valor2 && valor2 + valor3 > valor1) {
            JOptionPane.showMessageDialog(null, "Essas linhas podem formar um triângulo");
        }
        else {
            JOptionPane.showMessageDialog(null, "Essas linhas não podem formar um triângulo");

        }
    }
}
