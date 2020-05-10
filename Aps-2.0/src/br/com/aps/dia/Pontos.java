package br.com.aps.dia;

public class Pontos {

	private int pontos = 1000;

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public void perdePontos(String atividade) {
		pontos -= 100;
	}

	public void perdePontos(int quant, String atividade) {
		if (quant == 2) {
			pontos -= 100;
		}
	}
}
