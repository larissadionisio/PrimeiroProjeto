import java.util.Scanner;

public class Exemplos {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String funcionario = " ";
		System.out.println("Digite o nome do funcionário: "); 
		funcionario = input.next();
		
		int horas;
		System.out.print("\n Quantas horas o funcionário trabalhou? "); 
		horas = input.nextInt();
		
		float valor;
		System.out.print("\n Qual o valor pago por hora trabalhada? "); 
		valor = input.nextFloat();
		
      float salario;		
		salario = horas * valor;
		System.out.print(funcionario + " deve receber " + salario + " R$"); 
		
		 
	}
}