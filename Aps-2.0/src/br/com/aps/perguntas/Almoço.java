package br.com.aps.perguntas;

import br.com.aps.dia.Day;

public class Almoço implements Question {

	@Override
	public void question() {
		System.out.println("Hora do almoço!");
		System.out.println("Quer ir almoçar?");

	}

	public String opcoesDeAlmoço(int choice) {
		if (choice == 1) {
			Day.pontosPontos("restaurante");
			return "Você vai almoçar em um restaurante";
		} else if (choice == 2) {
			return "Você pede comida por delivery";
		}
		throw new RespostaInvalida("Resposta Invalida");

	}

	@Override
	public String resposta(int choice) {
		if (choice == 1) {
			return "Onde você quer comer?";
		} else if (choice == 2) {
			return "Você passa o resto do dia sem comer... \n...\n Você se sente fraco...";
		}
		throw new RespostaInvalida("Resposta Invalida");
	}

}
