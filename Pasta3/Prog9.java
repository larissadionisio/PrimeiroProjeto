import java.util.Scanner;

public class Prog9 {
		public static void main(String[] args) {
			int op;
			Scanner input = new Scanner(System.in);
			System.out.print("Digite a opção: ");
			op = input.nextInt();
			while(op <= 3) {
				System.out.println("op vale" + op);
				op++;			
			}
		
		}
}