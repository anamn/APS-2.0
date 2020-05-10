package br.com.aps.perguntas;
public class FimExpediente implements Question {

	@Override
	public void question() {
		System.out.println("Fim do expediente!");
		System.out.println("Você precisa ir embora");
		System.out.println("Desligar seu computador antes de ir?");
		
	}

	@Override
	public void sim() {
		System.out.println("Você desliga seu computador e vai embora");
		
	}

	@Override
	public void nao() {
		System.out.println("Você deixa o computador da empresa ligado...");
		
	}

}
