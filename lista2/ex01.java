package Lists.lista1.lista2;

import javax.swing.JOptionPane;

public class ex01 {
	/*
	 * Faça um programa que receba um vetor de valores e
	 * mostre a quantidade de valores negativos.
	 * Os valores e o tamanho do vetor devem ser
	 * informados pelo usuario.
	 */
	public static void main(String[] args) {
		int quantidadeNegativo = 0;

		int qntValores = Integer.parseInt(JOptionPane.showInputDialog("Quantos valores deseja digitar"));
		while (qntValores < 0) {
			qntValores = Integer
					.parseInt(JOptionPane.showInputDialog("Não aceitamos valores negativos, digite novamnete"));
		}

		int valor[] = new int[qntValores];
		for (int c = 0; c < qntValores; c++) {
			valor[c] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (c + 1) + " valor"));
			if (valor[c] < 0) {
				quantidadeNegativo += 1;
			}
		}
		JOptionPane.showMessageDialog(null, "A quantidade de valores negativos é: " + quantidadeNegativo);
	}
}
