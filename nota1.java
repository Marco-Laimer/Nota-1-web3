package projeto;
import java.util.Random;
import java.util.Scanner;
public class nota1 {

	public static void main(String[] args) {
       int escolhaJogador , escolhaComputador;
       Random gerador = new Random();
		Scanner teclado = new Scanner(System.in);
		System.out.println("*************");
		System.out.println("Escolha uma das op��es: ");
		System.out.println(" (1)- Pedra");
		System.out.println(" (2)- Papel");
		System.out.println(" (3)- Tesoura ");
		System.out.println("*************");
		
		escolhaJogador = teclado.nextInt();
		switch(escolhaJogador) {
		case 1:
			System.out.println("Voc� escolheu PEDRA");
			break;
		case 2:
			System.out.println("Voc� escolheu PAPEL");
			break;
		case 3:
			System.out.println("Voc� escolheu TESOURA");
			break;
		default:
			System.out.println("Op��o Inv�lida");
			break;
		}
		teclado.close();
		escolhaComputador = gerador.nextInt(3)+1; 
		switch(escolhaComputador) {
		case 1:
			System.out.println("Computador escolheu PEDRA");
			break;
		case 2:
			System.out.println("Computador escolheu PAPEL");
			break;
		case 3:
			System.out.println("Computador escolheu TESOURA");
			break;
			}
		
		System.out.println("");
		if (escolhaJogador == escolhaComputador) {
			System.out.println("******EMPATE!!!******");
		} else {
			if((escolhaJogador == 2 && escolhaComputador == 1) || (escolhaJogador == 3 && escolhaComputador == 2) || (escolhaJogador == 1 && escolhaComputador == 3) ) {
				System.out.println("****** VOC� VENCEU!!! ******");
			} else {
				System.out.println("****** Computador VENCEU!!! ******");
			}
		}

	}

}
