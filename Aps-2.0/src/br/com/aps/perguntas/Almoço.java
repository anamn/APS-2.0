package br.com.aps.perguntas;
public class Almo�o implements Question {

	@Override
	public void question() {
		System.out.println("Hora do almo�o!");
		System.out.println("Quer ir almo�ar?");
		
	}

	@Override
	public void sim() {
		System.out.println("Onde voc� quer comer?");
		System.out.println("1 - Restaurante caro\n2 - Pedir delivery");
		
	}

	@Override
	public void nao() {
		System.out.println("Voc� passa o resto do dia sem comer...");
		System.out.println("...");
		System.out.println("Voc� se sente fraco...");
		
	}

}
