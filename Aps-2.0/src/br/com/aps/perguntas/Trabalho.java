package br.com.aps.perguntas;

import br.com.aps.dia.Day;

public class Trabalho implements Question {
	
	Carro carro = new Carro();

	@Override
	public void question() {
		System.out.println("Voc� precisa ir para o trabalho!");
		if (Carro.times == 0) {
			System.out.println("Ir para o trabalho de transporte p�blico?");
		} else if (Carro.times == 1) {
			System.out.println("Quer ir com seu carro? ");

		}

	}

	@Override
	public String resposta(int choice) {
		if (choice == 1) {
			Day.pontosPontos("carro");
			return "Voc� vai para o trabalho";
		} else if (choice == 2) {
			return "Voc� vai a p� para o trabalho";
		}
		throw new RespostaInvalida("Resposta Invalida");
	}
}
