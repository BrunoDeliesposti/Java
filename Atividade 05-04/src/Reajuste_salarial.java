import java.util.Scanner;

public class Reajuste_salarial {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double salario, reajuste;
		int porcentagem;
		
		System.out.println("Digite o seu salário: ");
		salario = teclado.nextDouble();
		System.out.println("Digite a porcentagem de aumento: ");
		porcentagem = teclado.nextInt();
		
		reajuste = salario + ((salario * porcentagem)/100);
		
		System.out.println("O salário atual será: "+ reajuste);
		
	}

}
