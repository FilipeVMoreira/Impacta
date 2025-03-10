import javax.swing.*;
import java.util.Random;

/*
[DESAFIO] Crie um jogo onde o computador vai sortear um número
entre 1 e 5 o jogador vai tentar descobrir qual foi o valor
sorteado.
1- Obter um número aleatório entre 1 e 5 e armazená-lo numa variável (randomNum)
2- Abrir uma variável (num) que corresponda ao chute do jogador para iniciar um loop que ocorre enquanto os valores forem diferentes
3- Receber o valor do jogador e exibir se ele acertou, ou se o número é maior ou menor que o chutado
*/

public class ex32 {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNum = rand.nextInt(5) + 1;
        int num = 0;
        while (num != randomNum) {
            String numero = JOptionPane.showInputDialog("Escolha um número entre 1 e 5");
            num = Integer.parseInt(numero);
            if (num > randomNum) {
                JOptionPane.showMessageDialog(null, "Tente novamente com um número menor!");
            }
            else if (num < randomNum) {
                JOptionPane.showMessageDialog(null, "Tente novamente com um número maior!");
            }
        }
        JOptionPane.showMessageDialog(null, "Acertou!! O número era " + randomNum + "!");

    }
}
