import javax.swing.*;
import java.util.ArrayList;
/*
[DESAFIO] Desenvolva um programa que leia o primeiro termo e a
razão de uma PA (Progressão Aritmética), mostrando na tela os 10
primeiros elementos da PA e a soma entre todos os valores da
sequência.
1- Receber 2 variáveis, uma para o termo da PA (termo) e outra para a razão (razao)
2- Abrir mais 2 variáveis, uma para guardar os termos da lista (contador) e outra para ir
somando os valores (soma)
3- Iniciar um loop que ocorrerá até que o número de termos seja atingido e em cada repetição:
adicionar o termo a lista, somar a razão ao termo, somar o termo a soma e incrementar a variável
contadora.
4- Exibir a lista e a variável soma
*/

public class ex69 {
    public static void main(String[] args) {
       String x = JOptionPane.showInputDialog("Escreva o primeiro termo da PA");
       String y = JOptionPane.showInputDialog("Escreva a razão da PA");

       int termo = Integer.parseInt(x);
       int razao = Integer.parseInt(y);
       int contador = 0;
       int soma = 0;
        ArrayList<String> lista = new ArrayList<>();

       while (contador < 10){
           lista.add(String.valueOf(termo));
           termo += razao;
           soma += termo;
           contador++;
       }
       JOptionPane.showMessageDialog(null, lista);
       JOptionPane.showMessageDialog(null,"A soma entre os termos da PA é: " + soma);

    }
}
