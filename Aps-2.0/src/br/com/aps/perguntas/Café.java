package br.com.aps.perguntas;
public class Caf� implements Question {
	
	@Override
	public void question() {
		System.out.println("Quer tomar caf� da manh� ?");
		
	}
	@Override
	public void sim() {
		System.out.println("Voc� tomou caf� da manh�");
		
	}

	@Override
	public void nao() {
		System.out.println("Voc� n�o tomou caf� da manh�");
		
	}

}
