
public class Trabalho extends Question {
	Carro carro = new Carro();

	@Override
	public void question() {
		System.out.println("Você precisa ir para o trabalho!");
		if(Carro.times == 0) {
			System.out.println("Ir para o trabalho de transporte público?");
		}else if(Carro.times == 1) {
			System.out.println("Quer ir com seu carro? ");
			
		}
		
	}

	@Override
	public void sim() {
		System.out.println("Você vai para o trabalho");
	}

	@Override
	public void nao() {
		System.out.println("Você vai a pé para o trabalho");
	}
}
