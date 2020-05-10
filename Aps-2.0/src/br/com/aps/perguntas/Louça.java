package br.com.aps.perguntas;

import br.com.aps.dia.Day;

public class Lou�a implements Question {

	@Override
	public void question() {
		System.out.println("Chegando em casa, voc� precisa lavar a lou�a");
		System.out.println("...");
		System.out.println("A torneira est� aberta");
		System.out.println("Deseja fechar ela enquanto ensaboa os pratos? ");

	}

	@Override
	public String resposta(int choice) {
		if (choice == 1) {
			return "Voc� fecha a torneira at� terminar com os pratos";
		} else if (choice == 2) {
			Day.pontosPontos("louca");
			return "Voc� deixa a torneira aberta...";
		}
		throw new RespostaInvalida("Resposta Invalida");
	}

}
