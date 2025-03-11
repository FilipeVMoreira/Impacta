import javax.swing.*;

public class questao4 {
    public static void main(String[] args) {
        String x = JOptionPane.showInputDialog("Escreva um valor: ");
        int valor = Integer.parseInt(x);
        int quadrado = valor * valor;
        int cubo = valor * valor * valor;

        JOptionPane.showMessageDialog(null, "O valor ao quadrado é de: " + quadrado + "\n O valor ao cubo é de: " + cubo);
    }
}
