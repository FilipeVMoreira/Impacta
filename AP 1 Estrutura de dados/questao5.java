import javax.swing.*;

public class questao5 {
    public static void main(String[] args) {
        String x = JOptionPane.showInputDialog("Escreva o valor da base do triângulo: ");
        String y = JOptionPane.showInputDialog("Escreva o valor da altura do triângulo: ");

        double base = Double.parseDouble(x);
        double altura = Double.parseDouble(y);

        double area = (base * altura) / 2;

        JOptionPane.showMessageDialog(null, "A área do triângulo é de: " + area);
    }
}
