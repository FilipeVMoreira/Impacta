import javax.swing.*;

public class questao1 {
    public static void main(String[] args) {
        String temp = JOptionPane.showInputDialog("Escreva a temperatura em graus Fahrenheit: ");
        double grau = Double.parseDouble(temp);
        double conversao = (grau - 32) / 1.8;
        JOptionPane.showMessageDialog(null, "A temperatura convertida para graus celsius equivale a: " + conversao);
    }
}
