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
			return "Voc� levou seu pedido em uma sacola...";
		} else if (choice == 2) {
			return "Voc� n�o levou em uma sacola pl�stica";
		}
		throw new RespostaInvalida("Resposta Invalida");
	}

}
