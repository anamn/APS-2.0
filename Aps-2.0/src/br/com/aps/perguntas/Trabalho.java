package br.com.aps.perguntas;

public class Trabalho implements Question {
	Carro carro = new Carro();

	@Override
	public void question() {
		System.out.println("Voc� precisa ir para o trabalho!");
		if(Carro.times == 0) {
			System.out.println("Ir para o trabalho de transporte p�blico?");
		}else if(Carro.times == 1) {
			System.out.println("Quer ir com seu carro? ");
			
		}
		
	}

	@Override
	public void sim() {
		System.out.println("Voc� vai para o trabalho");
	}

	@Override
	public void nao() {
		System.out.println("Voc� vai a p� para o trabalho");
	}
}
