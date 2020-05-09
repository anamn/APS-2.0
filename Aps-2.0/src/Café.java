
public class Café extends Question {
	
	@Override
	public void question() {
		System.out.println("Quer tomar café da manhã ?");
		
	}
	@Override
	public void sim() {
		System.out.println("Você tomou café da manhã");
		
	}

	@Override
	public void nao() {
		System.out.println("Você não tomou café da manhã");
		
	}

}
