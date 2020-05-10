package br.com.aps.perguntas;

public class Dentes implements Question {

	protected int times = 0;
	private int quantidadeEscDentes = 0;

	@Override
	public void question() {
		if (times == 0) {
			System.out.println("Quer escovar os dentes?");
		} else {
			System.out.println("Quer escovar os dentes de novo?");
		}
	}

	@Override
	public String resposta(int choice) {
		if (choice == 1) {
			if (times == 0) {
				times++;
				return "Você escovou os dentes";
			} else {
				setQuantidadeEscDentes(getQuantidadeEscDentes() + 1);
				return "Você escovou os dentes de novo...";
			}
		}
		if (choice == 2) {
			return "Você não escovou os dentes";
		}
		throw new RespostaInvalida("Resposta Invalida");
	}

	public int getQuantidadeEscDentes() {
		return quantidadeEscDentes;
	}

	public void setQuantidadeEscDentes(int quantidadeEscDentes) {
		this.quantidadeEscDentes = quantidadeEscDentes;
	}
}
