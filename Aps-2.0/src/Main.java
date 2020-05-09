import java.util.Scanner;

public class Main {
	
	protected static int choice;
	
	public static void main(String[] args) {
		
		day();

		
	}
	
	public static void day() {
		Banho banho = new Banho();
		Dentes dentes = new Dentes();
		Café cafe = new Café();
		Carro carro = new Carro();
		Onibus onibus = new Onibus();
		Trabalho trabalho = new Trabalho();
		FimExpediente fim = new FimExpediente();
		Intervalo intervalo = new Intervalo();
		Almoço almoço = new Almoço();
		Louça louça = new Louça();
		
		banho.question();
		answer();
		if(choice == 1) {banho.sim();}
		else if(choice == 2) {banho.nao();}
		dentes.question();
		answer();
		if(choice == 1) {dentes.sim();}
		else if(choice ==2) {dentes.nao();}
		cafe.question();
		answer();
		if(choice == 1) {cafe.sim();}
		else if(choice == 2) {cafe.nao();}
		dentes.question();
		answer();
		if(choice == 1) {dentes.sim();}
		else if(choice == 2) {dentes.nao();}
		carro.question();
		answer();
		if(choice == 1) {carro.sim();}
		else if(choice == 2) {
			carro.nao();
			onibus.question();
			answer();
			if(choice == 1) {onibus.sim();}
			else if(choice ==2) {onibus.nao();}
		}
		intervalo.question();
		food();
		if(choice == 1) {
			System.out.println("Você pediu um combo pra viagem");
			System.out.println("Quer levar em uma sacola plástica?");
			answer();
			if(choice == 1) {System.out.println("Você levou seu pedido em uma sacola...");}
			else if(choice == 2) {System.out.println("Você não levou em uma sacola plástica");}
		} else if(choice == 2) {
			System.out.println("Você pediu um sanduíche caseiro do Tio");
			System.out.println("Quer levar em uma sacola plástica?");
			answer();
			if(choice == 1) {System.out.println("Você levou seu pedido em uma sacola...");}
			else if(choice == 2) {System.out.println("Você não levou em uma sacola plástica");}
		}else if(choice == 3) {
			System.out.println("Você toma um café e come um pão de queijo na cafeteria...");
		}
		trabalho.question();
		answer();
		if(choice == 1) {trabalho.sim();}
		else if(choice == 2) {trabalho.nao();}
		almoço.question();
		answer();
		if(choice == 1 ) {
			almoço.sim();
			food();
			if(choice == 1) {System.out.println("Você vai almoçar em um restaurante");}
			else if(choice == 2) {System.out.println("Você pede comida por delivery");}
		}
		else if(choice == 2) {almoço.nao();}
		fim.question();
		answer();
		if(choice == 1) {fim.sim();}
		else if(choice == 2) {fim.nao();}
		louça.question();
		answer();
		if(choice == 1) {louça.sim();}
		else if(choice == 2) {louça.nao();}
		System.out.println("O dia terminou");
		banho.question();
		answer();
		if(choice == 1) {banho.sim();}
		else if(choice == 2) {banho.nao();}
		System.out.println("Você decide ir dormir...");
		
		
		
		
		
		
		
		
	}
	public static void answer() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("=======================");
		System.out.println("|| 1 - Sim   2 - Não ||");
		System.out.println("===================");
		choice = scanner.nextInt();
	}
	public static void food() {
		Scanner scanner = new Scanner(System.in);
		choice = scanner.nextInt();
		
	}

}
