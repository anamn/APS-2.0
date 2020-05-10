package br.com.aps.perguntas;

public class Onibus implements Question {

	@Override
	public void question() {
		System.out.println("Quer ir de transporte p�blico?");

	}

	@Override
	public String resposta(int choice) {
		if (choice == 1) {
			return "Voc� escolheu ir de transporte p�blico \\n  Voc� pegou um �nibus at� a sua faculdade";
		} else if (choice == 2) {
			return "Voc� vai a p� at� sua faculdade";
		}
		throw new RespostaInvalida("Resposta Invalida");
	}

}
