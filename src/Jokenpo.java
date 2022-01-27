import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int escolhaDoUsuario;
		
		
		System.out.println("-------------------------");
		System.out.println("      JOKENPO ");
		System.out.println("-------------------------");
		System.out.println("1 - PEDRA");
		System.out.println("2 - PAPEL");
		System.out.println("3 - TESOURA");
		System.out.println("-------------------------");
						
		System.out.println();
		System.out.print("Qual a sua opção: ");
		
		escolhaDoUsuario = leitor.nextInt();
		
		System.out.println();
		
		if (escolhaDoUsuario == 1) {
			System.out.println("Você escolheu PEDRA");
		}else if (escolhaDoUsuario == 2) {
			System.out.println("Você escolheu PAPEL");
		}else if (escolhaDoUsuario ==3) {
			System.out.println("Você escolheu TESOURA");
		}
				
		Random aleatorio = new Random();
		int escolhaDoComputador = aleatorio.nextInt(3) +1;
					
		if (escolhaDoComputador == 1) {
			System.out.println("Computador escolheu PEDRA");
		}else if (escolhaDoComputador == 2) {
			System.out.println("Computador escolheu PAPEL");
		}else if (escolhaDoComputador ==3) {
			System.out.println("Computador escolheu TESOURA");
		}
		
		System.out.println();
		
		if (escolhaDoUsuario ==1 && escolhaDoComputador ==1) {
			System.out.println("Você e o Computador EMPATARAM!");
		}else if (escolhaDoUsuario ==1 && escolhaDoComputador ==2) {
			System.out.println("Computador GANHOU esta!");
		}else if (escolhaDoUsuario ==1 && escolhaDoComputador ==3) {
			System.out.println("Você GANHOU esta!");
		}else if (escolhaDoUsuario ==2 && escolhaDoComputador ==2){
			System.out.println("Você e o Computador EMPATARAM!");
		}else if (escolhaDoUsuario ==2 && escolhaDoComputador ==3) {
			System.out.println("Computador GANHOU esta!");	
		}else if (escolhaDoUsuario ==2 && escolhaDoComputador ==1) {
			System.out.println("Você GANHOU esta!");
		}else if (escolhaDoUsuario ==3 && escolhaDoComputador ==3) {
			System.out.println("Você e o Computador EMPATARAM!");		
		}else if (escolhaDoUsuario ==3 && escolhaDoComputador ==1) {
			System.out.println("Computador GANHOU esta!");
		}else if (escolhaDoUsuario ==3 && escolhaDoComputador ==2) {
			System.out.println("Você GANHOU esta!");
		}
									
	}

}
