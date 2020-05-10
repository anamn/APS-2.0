package br.com.aps.perguntas;

import br.com.aps.dia.Day;

public class Intervalo implements Question {

	@Override
	public void question() {
		System.out.println("Hora do intervalo!");
		System.out.println("Onde você quer comer?");
		System.out.println("1 - WcRonald's\n2 - Lanche do Tio\n3 - Cafeteria");

		// sacola
	}

	public void sacola() {
	}

	@Override
	public String resposta(int choice) {
		if (choice == 1) {
			Day.pontosPontos("wc");
			return "Você pediu um combo pra viagem";
		} else if (choice == 2) {
			return "Você pediu um sanduíche caseiro do Tio";
		} else if (choice == 3) {
			return "Você toma um café e come um pão de queijo na cafeteria...";
		}
		throw new RespostaInvalida("Resposta Invalida");
	}

}
