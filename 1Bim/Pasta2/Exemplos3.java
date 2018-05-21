import java.util.Random;

public class Exemplos3 {
	public static void main(String[] args){
		Random gera = new Random();
		int n = gera.nextInt(10) + 1;
		int tent;
		tent = 0;
		while(tent <= 3 ) {
			int num;
			System.out.print("\n Tente adivinhar o número: ");
			num = gera.nextInt();
			if(n == num) {
				System.out.println("Ganhou");
				break;
			} else {
				System.out.print("Perdeu");
				tent ++;
			}
			
		}
			
	}
}