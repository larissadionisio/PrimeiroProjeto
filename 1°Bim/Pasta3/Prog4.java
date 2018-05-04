import java.util.Scanner;

public class Prog4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nome = "";
		System.out.printf("Digite seu nome: ");
		nome = input.next();
		System.out.printf("\n Meu nome é %s\n", nome);
		int idade;
		System.out.printf("Digite sua idade: ");	
		idade = input.nextInt();
		System.out.printf("\n Minha idade é %d\n", idade);		
	}
}