package Controle;
public class SwitchSemBreak {
public static void main(String[] args) {
	
	String faixa = "verde";
	
	switch (faixa.toLowerCase()) {
	case "preta":
		System.out.println("Sei o Bassai-Dai");
	case "marrom":
		System.out.println("Sei o Tekki Shodan");
	case "roxa":
		System.out.println("Sei o Heian Godan");
	case "verde":
		System.out.println("Sei o Heian Yodan");
	case "laranja":
		System.out.println("Sei o Heian Sadan");
	case "vermelha":
		System.out.println("Sei o Heian Nidan");
	case "amarela":
		System.out.println("Sei o Heian Shodan");
		break;
	default:
		System.out.println("N�o sei nada");
	}
		System.out.println("Fim");
		System.out.println("\n");
	
		// O exemplo abaixo que � sem break pra valer
		
		int idade = 2;
		switch (idade) {
		case 3:
			System.out.println("Sabe programar");
		case 2:
			System.out.println("Sabe falar");
		case 1:
			System.out.println("Sabe andar");
		case 0:
			System.out.println("Sabe respirar");
		}
	
	
}
}