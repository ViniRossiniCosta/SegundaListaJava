package Lists.lista1.lista2;

import javax.swing.JOptionPane;

public class ex02 {
	/*
	 * Escreva um programa que receba quatro notas do aluno e as insira em um vetor.
	 * Depois, calcule a media aritmetica entre as quatro notas e
	 * mostre o "conceito" do aluno conforme as instruções:
	 * 9.0 ou maior = Conceito A
	 * entre 8.0 e 8.9 = Conceito B
	 * entre 7.0 e 7.9 = Conceito C
	 * menor que 7.0 = Conceito D
	 */
	public static void main(String[] args) {
		double media = 0;
		double somaT = 0;
		double[] notas = new double[4];

		for (int c = 0; c < 4; c++) {
			notas[c] = Integer.parseInt(JOptionPane.showInputDialog("Digite a " + (c + 1) + " nota"));
			while (notas[c] < 0) {
				notas[c] = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota novamente"));
			}
			somaT += notas[c];
		}
		media = somaT / 4;
		if (media >= 9) {
			JOptionPane.showMessageDialog(null, "Conceito A, com: " + media);
		} else if (media >= 8 && media <= 8.9) {
			JOptionPane.showMessageDialog(null, "Conceito B, com: " + media);
		} else if (media >= 7 && media <= 7.9) {
			JOptionPane.showMessageDialog(null, "Conceito C, com: " + media);
		} else if (media < 7) {
			JOptionPane.showMessageDialog(null, "Conceito D, com: " + media);
		}
	}
}
