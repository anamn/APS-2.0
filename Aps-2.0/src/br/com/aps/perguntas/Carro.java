package br.com.aps.perguntas;

import br.com.aps.dia.Day;

public class Carro implements Question {
	protected static int times = 0;

	@Override
	public void question() {
		if (times == 0) {
			System.out.println("Você precisa ir pra faculdade!");
			System.out.println("Quer ir de carro?");
		} else {
			System.out.println("Quer ir de carro?");
		}
	}

	@Override
	public String resposta(int choice) {
		if (choice == 1) {
			times++;
			Day.pontosPontos("carro");
			return "Você vai de carro então!";
		} else if (choice == 2) {
			return "Você não vai de carro então";

		}
		throw new RespostaInvalida("Resposta Invalida");
	}

}
