import javax.swing.*;
/*
[DESAFIO] Escreva um programa para calcular a redução do tempo
de vida de um fumante. Pergunte a quantidade de cigarros fumados
por dias e quantos anos ele já fumou. Considere que um fumante
perde 10 min de vida a cada cigarro. Calcule quantos dias de vida
um fumante perderá e exiba o total em dias.

1- Receber a quantidade de cigarros fumados por dia e armazenar em uma variável (qtd)
2- Multiplicar a variável por 10 para obter os minutos perdidos
3- Dividir o resultado por 1440 para obter os dias perdidos e exibir o resultado na tela
 */
public class ex16 {
    public static void main(String[] args) {
        String qtd = JOptionPane.showInputDialog("Escreva a quantidade de vezes que você fuma por dia: ");
        float num = Float.parseFloat(qtd);
        float minutos_perdidos = num * 10;
        JOptionPane.showMessageDialog(null, "Você perderá um total de " + minutos_perdidos / 1440 + " dias de vida!");

    }
}
