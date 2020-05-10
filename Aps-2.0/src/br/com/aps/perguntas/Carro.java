package br.com.aps.perguntas;
public class Carro implements Question {
	protected static int times = 0;

	@Override
	public void question() {
		if (times == 0) {
			System.out.println("Você precisa ir pra faculdade!");
			System.out.println("Quer ir de carro?");
		} else {
			System.out.println("Quer ir de carro?");
		}
	}

	@Override
	public void sim() {
		System.out.println("Você vai de carro então!");
		times++;

	}

	@Override
	public void nao() {
		System.out.println("Você não vai de carro então");

	}

}
