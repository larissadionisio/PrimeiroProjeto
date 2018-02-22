import java.util.*;

public class Desafio1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int bin[] = new int[100];
		System.out.print("Digite um número: ");
		int numero = input.nextInt();
		
		while (numero >= 1) {
			for(int i=0; i<10; i++){
				bin[i] = numero % 2;
				System.out.println(bin[i]);
				++i;
			}
				
			 numero = numero/2;
		}
		
	}
}
