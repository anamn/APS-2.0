package br.com.aps.perguntas;
public class Lou�a implements Question {

	@Override
	public void question() {
		System.out.println("Chegando em casa, voc� precisa lavar a lou�a");
		System.out.println("...");
		System.out.println("A torneira est� aberta");
		System.out.println("Deseja fechar ela enquanto ensaboa os pratos? ");
		
	}

	@Override
	public void sim() {
		System.out.println("Voc� fecha a torneira at� terminar com os pratos");
		
	}

	@Override
	public void nao() {
		System.out.println("Voc� deixa a torneira aberta...");
		
	}

}
