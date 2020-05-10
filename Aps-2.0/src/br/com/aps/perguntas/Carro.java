package br.com.aps.perguntas;

import br.com.aps.dia.Day;

public class Carro implements Question {
	protected static int times = 0;

	@Override
	public void question() {
		if (times == 0) {
			System.out.println("Voc� precisa ir pra faculdade!");
			System.out.println("Quer ir de carro?");
		} else {
			System.out.println("Quer ir de carro?");
		}
	}

	@Override
	public String resposta(int choice) {
		if (choice == 1) {
			times= times+1;
			Day.pontosPontos("carro");
			return "Voc� vai de carro ent�o!";
		} else if (choice == 2) {
			return "Voc� n�o vai de carro ent�o";

		}
		throw new RespostaInvalida("Resposta Invalida");
	}

}
