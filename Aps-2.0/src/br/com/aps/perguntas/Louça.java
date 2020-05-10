package br.com.aps.perguntas;
public class Louça implements Question {

	@Override
	public void question() {
		System.out.println("Chegando em casa, você precisa lavar a louça");
		System.out.println("...");
		System.out.println("A torneira está aberta");
		System.out.println("Deseja fechar ela enquanto ensaboa os pratos? ");
		
	}

	@Override
	public void sim() {
		System.out.println("Você fecha a torneira até terminar com os pratos");
		
	}

	@Override
	public void nao() {
		System.out.println("Você deixa a torneira aberta...");
		
	}

}
