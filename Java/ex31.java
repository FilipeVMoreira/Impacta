import javax.swing.*;
import java.util.Random;

/*
[DESAFIO] Crie um jogo de JoKenPo (Pedra-Papel-Tesoura)
1- Receber e armazenar uma entrada manual com a jogada do usuário: pedra(1), papel(2) e tesoura(3)
2- Obter um valor aleatório de 1 a 3 e armazená-lo numa variável (cpu)
3- Comparar cpu com jogada do jogador para ver qual obteve vitória e exibir resultado
*/
public class ex31 {
    public static void main(String[] args) {
        String jogada = JOptionPane.showInputDialog("Escolha entre pedra(1), papel(2) e tesoura(3)");
        int num = Integer.parseInt(jogada);
        Random random = new Random();
        int cpu = random.nextInt(3) + 1;

        if (cpu == num){
            System.out.println("Empate! Tente novamente!");
        }
        else if(num == 1 && cpu == 3){
            System.out.println("O oponente jogou tesoura! Você venceu!");
        }
        else if (num == 2 && cpu == 1) {
            System.out.println("O oponente jogou pedra! Você venceu!");
        }
        else if(num == 3 && cpu == 2){
            System.out.println("O oponente jogou papel! Você venceu!");
        }
        else if(num == 3 && cpu == 1){
            System.out.println("O oponente jogou pedra... Você perdeu!");
        }
        else if (num == 1 && cpu == 2) {
            System.out.println("O oponente jogou papel... Você perdeu!");
        }
        else {
            System.out.println("O oponente jogou tesoura... Você perdeu!");
        }


    }
}
