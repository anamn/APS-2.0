package br.com.aps.perguntas;

public class Onibus implements Question {

	@Override
	public void question() {
		System.out.println("Quer ir de transporte público?");

	}

	@Override
	public String resposta(int choice) {
		if (choice == 1) {
			return "Você escolheu ir de transporte público \\n  Você pegou um ônibus até a sua faculdade";
		} else if (choice == 2) {
			return "Você vai a pé até sua faculdade";
		}
		throw new RespostaInvalida("Resposta Invalida");
	}

}
