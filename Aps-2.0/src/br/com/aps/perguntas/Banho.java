package br.com.aps.perguntas;
public class Banho implements Question {
	private int times = 0;
	private int quantidadeDeBanhos = 0;
	
	@Override
	public void question() {
		if(times == 0) {
			System.out.println("O dia come�ou, quer tomar banho?");
		}else {
			System.out.println("Quer tomar banho de novo?");
		}
		
		
	}

	@Override
	public String resposta(int choice) {
		if (choice == 1) {
			times++;
			setQuantidadeDeBanhos(getQuantidadeDeBanhos() + 1);
			return "Voc� tomou banho";
		} else if (choice == 2) {
			return "Voc� n�o tomou banho";
		}
		throw new RespostaInvalida("Resposta Invalida");
	}

	public int getQuantidadeDeBanhos() {
		return quantidadeDeBanhos;
	}

	public void setQuantidadeDeBanhos(int quantidadeDeBanhos) {
		this.quantidadeDeBanhos = quantidadeDeBanhos;
	}


}
