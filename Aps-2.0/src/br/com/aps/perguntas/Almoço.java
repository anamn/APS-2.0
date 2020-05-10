package br.com.aps.perguntas;

import br.com.aps.dia.Day;

public class Almo�o implements Question {

	@Override
	public void question() {
		System.out.println("Hora do almo�o!");
		System.out.println("Quer ir almo�ar?");

	}

	public String opcoesDeAlmo�o(int choice) {
		if (choice == 1) {
			Day.pontosPontos("restaurante");
			return "Voc� vai almo�ar em um restaurante";
		} else if (choice == 2) {
			return "Voc� pede comida por delivery";
		}
		throw new RespostaInvalida("Resposta Invalida");

	}

	@Override
	public String resposta(int choice) {
		if (choice == 1) {
			return "Onde voc� quer comer?";
		} else if (choice == 2) {
			return "Voc� passa o resto do dia sem comer... \n...\n Voc� se sente fraco...";
		}
		throw new RespostaInvalida("Resposta Invalida");
	}

}
