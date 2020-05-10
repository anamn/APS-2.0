package br.com.aps.dia;
import java.util.Scanner;

import br.com.aps.perguntas.Almoço;
import br.com.aps.perguntas.Banho;
import br.com.aps.perguntas.Café;
import br.com.aps.perguntas.Carro;
import br.com.aps.perguntas.Dentes;
import br.com.aps.perguntas.FimExpediente;
import br.com.aps.perguntas.Intervalo;
import br.com.aps.perguntas.Louça;
import br.com.aps.perguntas.Onibus;
import br.com.aps.perguntas.Trabalho;

public class Day {

	private static int choice;
	private int quantidadeDeBanhos = 0;
	private int quantidadeEscDentes = 0;
	private int quantidadeVezesQueComeu = 0;
    private  Banho banho = new Banho();
    private Dentes dentes = new Dentes();
    private Café cafe = new Café();
    private Carro carro = new Carro();
    private Onibus onibus = new Onibus();
    private Trabalho trabalho = new Trabalho();
    private FimExpediente fim = new FimExpediente();
    private Intervalo intervalo = new Intervalo();
    private Almoço almoco = new Almoço();
    private Louça louca = new Louça();
    private Pontos pontos = new Pontos();
	
	public  void day() {

		banho.question();
		answer();
		if (choice == 1) {
			banho.sim();
			quantidadeDeBanhos++;
		} else if (choice == 2) {
			banho.nao();
		}
		dentes.question();
		answer();
		if (choice == 1) {
			dentes.sim();
			quantidadeEscDentes++;
		} else if (choice == 2) {
			dentes.nao();
		}
		cafe.question();
		answer();
		if (choice == 1) {
			cafe.sim();
			quantidadeVezesQueComeu++;
		} else if (choice == 2) {
			cafe.nao();
			
		}
		dentes.question();
		answer();
		if (choice == 1) {
			dentes.sim();
			quantidadeEscDentes++;
		} else if (choice == 2) {
			dentes.nao();
		}
		carro.question();
		answer();
		if (choice == 1) {
			carro.sim();
			pontos.perdePontos("carro");
		} else if (choice == 2) {
			carro.nao();
			onibus.question();
			answer();
			if (choice == 1) {
				onibus.sim();
			} else if (choice == 2) {
				onibus.nao();
			}
		}
		intervalo.question();
		food();
		if (choice == 1) {
			pontos.perdePontos("wc");
			System.out.println("Você pediu um combo pra viagem");
			System.out.println("Quer levar em uma sacola plástica?");
			answer();
			if (choice == 1) {
				System.out.println("Você levou seu pedido em uma sacola...");
				pontos.perdePontos("sacola");
			} else if (choice == 2) {
				System.out.println("Você não levou em uma sacola plástica");
			}
		} else if (choice == 2) {
			System.out.println("Você pediu um sanduíche caseiro do Tio");
			System.out.println("Quer levar em uma sacola plástica?");
			answer();
			if (choice == 1) {
				System.out.println("Você levou seu pedido em uma sacola...");
				pontos.perdePontos("sacola");
			} else if (choice == 2) {
				System.out.println("Você não levou em uma sacola plástica");
			}
		} else if (choice == 3) {
			System.out.println("Você toma um café e come um pão de queijo na cafeteria...");
		}
		trabalho.question();
		answer();
		if (choice == 1) {
			trabalho.sim();
			pontos.perdePontos("carro");
		} else if (choice == 2) {
			trabalho.nao();
		}
		almoco.question();
		answer();
		if (choice == 1) {
			almoco.sim();
			quantidadeVezesQueComeu++;
			food();
			if (choice == 1) {
				System.out.println("Você vai almoçar em um restaurante");
				pontos.perdePontos("restaurante");
			} else if (choice == 2) {
				System.out.println("Você pede comida por delivery");
			}
		} else if (choice == 2) {
			almoco.nao();
		}
		fim.question();
		answer();
		if (choice == 1) {
			fim.sim();
		} else if (choice == 2) {
			fim.nao();
			pontos.perdePontos("computador");
		}
		louca.question();
		answer();
		if (choice == 1) {
			louca.sim();
		} else if (choice == 2) {
			louca.nao();
			pontos.perdePontos("louca");
		}
		System.out.println("O dia terminou");
		banho.question();
		answer();
		if (choice == 1) {
			banho.sim();
			quantidadeDeBanhos++;
		} else if (choice == 2) {
			banho.nao();
		}
		pontos.perdePontos(quantidadeDeBanhos, "banho");
		pontos.perdePontos(quantidadeEscDentes, "dentes");
		
		System.out.println("Você decide ir dormir...");
		System.out.println("Você terminou o dia com: " + pontos.getPontos() +" pontos");

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
