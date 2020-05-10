package br.com.aps.perguntas;

public class RespostaInvalida extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public RespostaInvalida(String msg) {
		super(msg);
	}

}
