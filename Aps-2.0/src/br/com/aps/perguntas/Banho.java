package br.com.aps.perguntas;
public class Banho implements Question {
	private int times = 0;
	
	@Override
	public void question() {
		if(times == 0) {
			System.out.println("O dia começou, quer tomar banho?");
		}else {
			System.out.println("Quer tomar banho de novo?");
		}
		
		
	}

	@Override
	public void sim() {
		System.out.println("Você tomou banho");
		times++;
	}

	@Override
	public void nao() {
		System.out.println("Você não tomou banho");
		
	}


}
