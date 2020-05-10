package br.com.aps.dia;

import java.util.Set;
import java.util.TreeSet;

public class Pontos {

	private int pontos = 1000;
	private Set<String> atividades = new TreeSet<>();

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public void perdePontos(String atividade) {
		atividades.add(atividade);
		pontos -= 100;
	}

	public void perdePontos(int quant, String atividade) {
		if (quant == 2) {
			atividades.add(atividade);
			pontos -= 100;
		}
	}

	public Set<String> getAtividades() {
		return atividades;
	}
}
