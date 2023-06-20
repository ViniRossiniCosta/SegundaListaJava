package Lists.lista1.lista2;

import javax.swing.JOptionPane;

public class ex05 {
	/*
	 * Faça um programa que solicite alguns dados dos usuarios que frequentam um
	 * clube.
	 * O programa deve solicitar a idade, se a pessoa é fumante ou não (1- SIM, 2-
	 * NÃO),
	 * seu salario liquido e hj quanto tempo frequenta o clube (em meses).
	 * O usuario devere digitar ha encerrar a quando não tiver
	 * mais pessoas para registrar.
	 * Como dados de salda, o programa deve exibir:
	 * A media das idades das pessoas;
	 * A media salarial das pessoas;
	 * Quantos sao fumantes e quantos nao sao fumantes;
	 * A porcentagem de pessoas que frequentam o clube ha mais de 03 meses.
	 */
	public static void main(String[] args) {
		String continuar = "";

		double tempo = 0;
		double acimaTempo = 0;
		double porcentTempo = 0;

		int qntFumantes = 0;
		int qntNFumantes = 0;

		int contaClienete = 0;
		int fumante = 0;

		int idade = 0;
		int somaIdade = 0;
		int mediaIdade = 0;

		int salario = 0;
		int somaSalario = 0;
		int mediaSalario = 0;

		do {
			contaClienete += 1;

			idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do cliente " + contaClienete));
			while (idade < 18) {
				idade = Integer
						.parseInt(JOptionPane.showInputDialog("Não são permitidos clientes com menores de 18 anos"));
			}
			somaIdade += idade;

			salario = Integer.parseInt(JOptionPane.showInputDialog("Quanto o cliente " + contaClienete + " ganha ?"));
			while (salario < 500) {
				salario = Integer
						.parseInt(JOptionPane.showInputDialog("Não é aceito salario negativo ou abaixo de 500"));
			}
			somaSalario += salario;

			fumante = Integer.parseInt(
					JOptionPane.showInputDialog("O cliente " + contaClienete + " é fumante ? (1- SIM, 2- NÃO)"));
			if (fumante == 1) {
				qntFumantes += 1;
			} else {
				qntNFumantes += 1;
			}

			tempo = Integer.parseInt(JOptionPane.showInputDialog(
					"Quanto tempo o cliente " + contaClienete + " frequenta o estabelecimento ?\nEm meses"));
			if (tempo >= 3) {
				acimaTempo += 1;
			}

			continuar = JOptionPane.showInputDialog("Deseja continuar? sim, encerrar (finalizar)");
		} while (continuar.equals("sim"));

		mediaSalario = somaSalario / contaClienete;
		mediaIdade = somaIdade / contaClienete;
		porcentTempo = (acimaTempo / contaClienete) * 100;

		JOptionPane.showMessageDialog(null,
				"A m�dia das idades das pessoas: " + mediaIdade + "\nA média salarial das pessoas: " + mediaSalario
						+ "\nFumantes: " + qntFumantes + "\nNão fumantes: " + qntNFumantes
						+ "\nClientes acima de 3 meses: " + porcentTempo + "%");
	}
}
