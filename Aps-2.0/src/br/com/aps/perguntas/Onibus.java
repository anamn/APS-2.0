package br.com.aps.perguntas;
public class Onibus implements Question {

	@Override
	public void question() {
		System.out.println("Quer ir de transporte p�blico?");
		
	}

	@Override
	public void sim() {
		System.out.println("Voc� escolheu ir de transporte p�blico");
		System.out.println("Voc� pegou um �nibus at� a sua faculdade");
		
	}

	@Override
	public void nao() {
		System.out.println("Voc� vai a p� at� sua faculdade");
		
	}


}
