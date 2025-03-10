import javax.swing.*;
import java.util.Random;
/*
[DESAFIO] Vamos melhorar o jogo que fizemos no exercício
32. A partir de agora, o computador vai sortear um número entre
1 e 10 e o jogador vai ter 4 tentativas para tentar acertar.
1- Obter um número aleatório entre 1 e 10 e armazená-lo numa variável (randomNum)
2- Criar uma variável para as 4 tentativas
3- Abrir uma variável (num) que corresponda ao chute do jogador para iniciar um loop que ocorre enquanto os valores forem diferentes
4- Receber o valor do jogador e exibir se ele acertou, ou se o número é maior ou menor que o chutado e descontar uma das tentativas para cada chute
5- Se as chances zerarem e o jogador não acertar, exibe uma mensagem de derrota
*/
public class ex55 {
    public static void main(String[] args) {

        Random rand = new Random();
        int randomNum = rand.nextInt(10) + 1;
        int num = 0;
        int tentativas = 4;
        while (num != randomNum) {
            while (tentativas >= 0){
                String numero = JOptionPane.showInputDialog("Escolha um número entre 1 e 10 | " + tentativas + " tentativas restantes!");
                num = Integer.parseInt(numero);
                tentativas--;
                if (num > randomNum) {
                    JOptionPane.showMessageDialog(null, "Tente novamente com um número menor!");
                }
                else if (num < randomNum) {
                    JOptionPane.showMessageDialog(null, "Tente novamente com um número maior!");
                }
                if (num == randomNum) {
                    break;
                }
            }
            if (num != randomNum) {
            JOptionPane.showMessageDialog(null, "Acabaram suas chances! Você perdeu!");
            System.exit(0);
            }
        }
        JOptionPane.showMessageDialog(null, "Acertou!! O número era " + randomNum + "!");


    }
}
