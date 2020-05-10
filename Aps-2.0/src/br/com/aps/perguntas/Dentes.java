package br.com.aps.perguntas;
public class Dentes implements Question {
	protected int times = 0;

	@Override
	public void question() {
		if (times == 0) {
			System.out.println("Quer escovar os dentes?");
		} else {
			System.out.println("Quer escovar os dentes de novo?");
		}

	}

	@Override
	public void sim() {
		if (times == 0) {
			System.out.println("Voc� escovou os dentes");
			times++;
		} else {
			System.out.println("Voc� escovou os dentes de novo...");
		}

	}

	@Override
	public void nao() {
		System.out.println("Voc� n�o escovou os dentes");
	}


}
