import static java.lang.Math.sqrt;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class hipotenusa 
{
	public static void main(String[] args) {
    	int catUm = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro caceto: "));
    	int catDois = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do segundo caceto: "));
    	double CalculoHipotenusa = Math.sqrt(Math.pow(catUm, 2)+ Math.pow(catDois, 2));
    	
    	JOptionPane.showMessageDialog(null, String.format("O valor da hipotenusa é %.2f!", CalculoHipotenusa));
    }
    
}