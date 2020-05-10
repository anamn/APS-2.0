package br.com.aps.perguntas;

import br.com.aps.dia.Day;

public class FimExpediente implements Question {

	@Override
	public void question() {
		System.out.println("Fim do expediente!");
		System.out.println("Você precisa ir embora");
		System.out.println("Desligar seu computador antes de ir?");

	}

	@Override
	public String resposta(int choice) {
		if (choice == 1) {
			return "Você desliga seu computador e vai embora";
		} else if (choice == 2) {
			Day.pontosPontos("computador");
			return "Você deixa o computador da empresa ligado...";
		}
		throw new RespostaInvalida("Resposta Invalida");
	}

}
