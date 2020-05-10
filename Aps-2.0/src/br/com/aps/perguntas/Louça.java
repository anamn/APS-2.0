package br.com.aps.perguntas;

import br.com.aps.dia.Day;

public class Louça implements Question {

	@Override
	public void question() {
		System.out.println("Chegando em casa, você precisa lavar a louça");
		System.out.println("...");
		System.out.println("A torneira está aberta");
		System.out.println("Deseja fechar ela enquanto ensaboa os pratos? ");

	}

	@Override
	public String resposta(int choice) {
		if (choice == 1) {
			return "Você fecha a torneira até terminar com os pratos";
		} else if (choice == 2) {
			Day.pontosPontos("louca");
			return "Você deixa a torneira aberta...";
		}
		throw new RespostaInvalida("Resposta Invalida");
	}

}
