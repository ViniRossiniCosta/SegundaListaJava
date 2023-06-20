package Lists.lista1.lista2;

import javax.swing.JOptionPane;

public class ex04 {
	/*
	 * Sabe-se que o latao é constituido de 70% de cobre e 30% de zinco.
	 * Faça um programa que permita ao usuario informar uma quantidade de latao em
	 * quilos
	 * e forneça o total de cobre e zinco necesserios para fabricar essa quantidade.
	 */
	public static void main(String[] args) {
		double zinco = 0;
		double cobre = 0;
		int latao = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de latão"));
		cobre = latao * 0.70;
		zinco = latao * 0.30;
		JOptionPane.showMessageDialog(null, "Para essa quantidade de latão: " + latao
				+ "\nCobre: " + cobre + "\nZinco: " + zinco);
	}
}
