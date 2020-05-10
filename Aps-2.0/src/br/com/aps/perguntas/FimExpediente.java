package br.com.aps.perguntas;
public class FimExpediente implements Question {

	@Override
	public void question() {
		System.out.println("Fim do expediente!");
		System.out.println("Voc� precisa ir embora");
		System.out.println("Desligar seu computador antes de ir?");
		
	}

	@Override
	public void sim() {
		System.out.println("Voc� desliga seu computador e vai embora");
		
	}

	@Override
	public void nao() {
		System.out.println("Voc� deixa o computador da empresa ligado...");
		
	}

}
