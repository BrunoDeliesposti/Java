
import java.text.DecimalFormat; 
import java.util.Scanner;
public class Aluguel_de_carros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int dias;
		float km;
		double pago;
		
		System.out.printf("Quantos dias alugado? ");
		dias = teclado.nextInt();
		System.out.printf("Quantos km rodados? ");
		km = teclado.nextFloat();
		
		pago = ((dias * 59) + (km * 15));
		
		System.out.printf("O total a pagar é de R$ %.2f", pago);
		
	}
}
