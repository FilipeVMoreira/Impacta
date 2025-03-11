import javax.swing.*;

public class questao2 {
    public static void main(String[] args) {
        String temp = JOptionPane.showInputDialog("Escreva a temperatura em graus celsius: ");
        double grau = Double.parseDouble(temp);
        double conversao = grau * 1.8 + 32;
        JOptionPane.showMessageDialog(null, "A temperatura convertida para graus Fahrenheit equivale a: " + conversao);
    }
}

