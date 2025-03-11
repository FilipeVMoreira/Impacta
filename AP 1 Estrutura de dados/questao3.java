import javax.swing.*;

public class questao3 {
    public static void main(String[] args) {
        String x = JOptionPane.showInputDialog("Digite seu peso");
        String y = JOptionPane.showInputDialog("Digite sua altura");

        double peso = Double.parseDouble(x);
        double altura = Double.parseDouble(y);
        double IMC = peso / (altura * altura);

        JOptionPane.showMessageDialog(null,"O seu IMC é de: " + IMC);
    }
}
