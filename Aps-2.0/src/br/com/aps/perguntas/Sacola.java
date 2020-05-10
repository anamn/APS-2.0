package br.com.aps.perguntas;

import br.com.aps.dia.Day;

public class Sacola implements Question {

	@Override
	public void question() {
		System.out.println("Quer levar numa sacola?");

	}

	@Override
	public String resposta(int choice) {
		if (choice == 1) {
			Day.pontosPontos("sacola");
			return "Você levou seu pedido em uma sacola...";
		} else if (choice == 2) {
			return "Você não levou em uma sacola plástica";
		}
		throw new RespostaInvalida("Resposta Invalida");
	}

}
