package br.com.aps.perguntas;
public class Almoço implements Question {

	@Override
	public void question() {
		System.out.println("Hora do almoço!");
		System.out.println("Quer ir almoçar?");
		
	}

	@Override
	public void sim() {
		System.out.println("Onde você quer comer?");
		System.out.println("1 - Restaurante caro\n2 - Pedir delivery");
		
	}

	@Override
	public void nao() {
		System.out.println("Você passa o resto do dia sem comer...");
		System.out.println("...");
		System.out.println("Você se sente fraco...");
		
	}

}
