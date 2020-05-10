package br.com.aps.perguntas;
public class Onibus implements Question {

	@Override
	public void question() {
		System.out.println("Quer ir de transporte público?");
		
	}

	@Override
	public void sim() {
		System.out.println("Você escolheu ir de transporte público");
		System.out.println("Você pegou um ônibus até a sua faculdade");
		
	}

	@Override
	public void nao() {
		System.out.println("Você vai a pé até sua faculdade");
		
	}


}
