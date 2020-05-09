
public class Dentes extends Question {
	protected int times = 0;

	@Override
	public void question() {
		if (times == 0) {
			System.out.println("Quer escovar os dentes?");
		} else {
			System.out.println("Quer escovar os dentes de novo?");
		}

	}

	@Override
	public void sim() {
		if (times == 0) {
			System.out.println("Você escovou os dentes");
			times++;
		} else {
			System.out.println("Você escovou os dentes de novo...");
		}

	}

	@Override
	public void nao() {
		System.out.println("Você não escovou os dentes");
	}


}
