package br.com.aps.dia;

import java.util.Scanner;

import br.com.aps.perguntas.Almo�o;
import br.com.aps.perguntas.Banho;
import br.com.aps.perguntas.Caf�;
import br.com.aps.perguntas.Carro;
import br.com.aps.perguntas.Dentes;
import br.com.aps.perguntas.FimExpediente;
import br.com.aps.perguntas.Intervalo;
import br.com.aps.perguntas.Lou�a;
import br.com.aps.perguntas.Onibus;
import br.com.aps.perguntas.Sacola;
import br.com.aps.perguntas.Trabalho;

public class Day {

	private static int choice;
	private Banho banho = new Banho();
	private Dentes dentes = new Dentes();
	private Caf� cafe = new Caf�();
	private Carro carro = new Carro();
	private Onibus onibus = new Onibus();
	private Trabalho trabalho = new Trabalho();
	private FimExpediente fim = new FimExpediente();
	private Intervalo intervalo = new Intervalo();
	private Sacola sacola = new Sacola();
	private Almo�o almoco = new Almo�o();
	private Lou�a louca = new Lou�a();
	private static Pontos pontos = new Pontos();
	private Consequencias consequencias = new Consequencias();

	public void day() {

		banho.question();
		answer();
		System.out.println(banho.resposta(choice));

		dentes.question();
		answer();
		System.out.println(dentes.resposta(choice));

		cafe.question();
		answer();
		System.out.println(cafe.resposta(choice));

		dentes.question();
		answer();
		System.out.println(dentes.resposta(choice));

		carro.question();
		answer();
		System.out.println(carro.resposta(choice));
		if (carro.resposta(choice).equals("Voc� n�o vai de carro ent�o")) {
			onibus.question();
			answer();
			onibus.resposta(choice);
		}

		intervalo.question();
		food();
		System.out.println(intervalo.resposta(choice));
		sacola.question();
		answer();
		System.out.println(sacola.resposta(choice));

		trabalho.question();
		answer();
		trabalho.resposta(choice);

		almoco.question();
		answer();
		System.out.println(almoco.resposta(choice));
		if (almoco.resposta(choice).equals("Onde voc� quer comer?")) {
			System.out.println("1 - Restaurante caro\n2 - Pedir delivery");
			food();
			almoco.opcoesDeAlmo�o(choice);
		}

		fim.question();
		answer();
		System.out.println(fim.resposta(choice));

		louca.question();
		answer();
		System.out.println(louca.resposta(choice));
		System.out.println("O dia terminou");

		banho.question();
		answer();
		System.out.println(banho.resposta(choice));

		pontos.perdePontos(banho.getQuantidadeDeBanhos(), "banho");
		pontos.perdePontos(dentes.getQuantidadeEscDentes(), "dentes");

		System.out.println("Voc� vai ir dormir...");
		System.out.println("Voc� terminou o dia com: " + pontos.getPontos() + " pontos");
		consequencias.retornaAsConse(pontos.getAtividades());

	}

	public static void pontosPontos(String atividade) {
		pontos.perdePontos(atividade);
	}

	public static void answer() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("=======================");
		System.out.println("|| 1 - Sim   2 - N�o ||");
		System.out.println("===================");
		choice = scanner.nextInt();
	}

	public static void food() {
		Scanner scanner = new Scanner(System.in);
		choice = scanner.nextInt();
	}
}
