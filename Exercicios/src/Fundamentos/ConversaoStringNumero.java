package Fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	
	public static void main(String[] args) {
		
	String valor1 = JOptionPane.showInputDialog(
			"Digite o Primeiro N�mero");
	String valor2 = JOptionPane.showInputDialog(
			"Digite o Segundo N�mero");
	System.out.println(valor1 + " e " + valor2);	
	
	double numero1 = Double.parseDouble(valor1);
	double numero2 = Double.parseDouble(valor2);
	
	double soma = numero1 + numero2;
	System.out.println("Soma � " + soma);
	System.out.println("M�dia � " + soma / 2);
	
	}
}