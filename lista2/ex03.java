package Lists.lista1.lista2;

import javax.swing.JOptionPane;

public class ex03 {
	/*
	 * Escreva um programa que leia um numero inteiro e apresente um menu para o
	 * usuario escolher: Verificar se o numero a multiplo de algum outro numero
	 * (pedir ao usuario esse numero); Verificar se o numero a par; Verificar se o
	 * numero esta entre 0 e 1000; Sair Apss as entradas de dados, deve ser mostrado
	 * ao ususrio o resultado da respectiva opcao escolhida, e novamente o menu.
	 * Para a opção 4- Sair, utilize System.exit(0);
	 */
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		int escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha o que deseja fazer\n"
				+ "1 - o multiplo de algum numero?\n" + "2 - b par?\n" + "3 - c esta entre 0 a 1000\n" + "4 - Sair"));
		switch (escolha) {
			case 1: {
				int multiplo = Integer.parseInt(JOptionPane.showInputDialog("Qual o multiplo desse numero: " + num));
				multiplo = num / multiplo;
				JOptionPane.showMessageDialog(null, "O valor com o multiplo é: " + multiplo);
				break;
			}
			case 2: {
				if (num % 2 == 0) {
					JOptionPane.showMessageDialog(null, "O numero " + num + " é par");
				} else {
					JOptionPane.showMessageDialog(null, "O numero " + num + " não é par");
				}
				break;
			}
			case 3: {
				if (0 >= num && num <= 1000) {
					JOptionPane.showMessageDialog(null, "O numero estão entre 0 e 1000");
				}
				break;
			}
			case 4: {
				System.exit(0);
				break;
			}
		}
	}
}
