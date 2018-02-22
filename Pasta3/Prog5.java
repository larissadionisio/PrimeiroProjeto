import java.util.Scanner;

public class Prog5 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			String nome = "";
			System.out.printf("Digite seu nome: ");
			nome = input.next();
			System.out.printf("\n Meu nome é %s\n", nome);
			System.out.printf("Digite sua idade: ");	
			int idade = Integer.parseInt(input.next());
			System.out.printf("\n Minha idade é %d\n", idade);			
		}
}