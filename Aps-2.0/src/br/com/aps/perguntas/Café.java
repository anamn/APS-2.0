package br.com.aps.perguntas;

public class Caf� implements Question {

	@Override
	public void question() {
		System.out.println("Quer tomar caf� da manh� ?");

	}

	@Override
	public String resposta(int choice) {
		if (choice == 1) {
			return "Voc� tomou caf� da manh�";
		} else if (choice == 2) {
			return "Voc� n�o tomou caf� da manh�";

		}
		throw new RespostaInvalida("Resposta Invalida");

	}

}
