import java.util.Scanner;

public class temperatura {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		float celcius, fahrenheit;
		
		System.out.println("Informe a temperatura em Cº: ");
		celcius = teclado.nextFloat();
		
		fahrenheit = ((celcius * 9) / 5) + 32;
		
		System.out.println("A temperatura correspondente é: "+ fahrenheit);	
		
	}
}