package br.com.aps.perguntas;
public class Intervalo implements Question {


	@Override
	public void question() {
		System.out.println("Hora do intervalo!");
		System.out.println("Onde você quer comer?");
		System.out.println("1 - WcRonald's\n2 - Lanche do Tio\n3 - Cafeteria");
		
		//sacola
	}

	@Override
	public void sim() {
		
	}

	@Override
	public void nao() {
		
	}
	public void sacola() {
		System.out.println("Quer levar numa sacola?");
	}


}
