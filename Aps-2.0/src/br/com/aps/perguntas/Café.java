package br.com.aps.perguntas;

public class Café implements Question {

	@Override
	public void question() {
		System.out.println("Quer tomar café da manhã ?");

	}

	@Override
	public String resposta(int choice) {
		if (choice == 1) {
			return "Você tomou café da manhã";
		} else if (choice == 2) {
			return "Você não tomou café da manhã";

		}
		throw new RespostaInvalida("Resposta Invalida");

	}

}
