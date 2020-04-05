
import java.util.Scanner;

public class dobro_triplo {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		
		int n, dobro, triplo;
	
		
		System.out.println("Digite um número: ");
		
		n = numero.nextInt();
	
		dobro = n + n;
		triplo = n * 3;
					
		System.out.println(" O dobro é: " + dobro);
		System.out.println(" O triplo é: " + triplo);
		
	}
}