package br.com.aps.dia;

import java.util.Set;

import br.com.aps.consequencia.DesperdicioDeAgua;
import br.com.aps.consequencia.Eletronica;
import br.com.aps.consequencia.PoluicaoDoAr;
import br.com.aps.consequencia.PoluiçaoMarinha;

public class Consequencias {
	
	DesperdicioDeAgua agua= new DesperdicioDeAgua();
	Eletronica computador= new Eletronica();
	PoluicaoDoAr ar= new PoluicaoDoAr();
	PoluiçaoMarinha marinha= new PoluiçaoMarinha();
	
	public void retornaAsConse(Set<String> atividades){
		for(String atividade: atividades) {
			if(atividade.equals("banho")) {
				System.out.println(agua.banho());
			}
			if(atividade.equals("dentes")) {
				System.out.println(agua.escovarOsDentes());
			}
			if(atividade.equals("carro")) {
				System.out.println(ar.consequencia());
			}
			if(atividade.equals("sacola")) {
				System.out.println(marinha.consequencia());
			}
			if(atividade.equals("computador")) {
				System.out.println(computador.consequencia());
			}
			if(atividade.equals("louca")) {
				System.out.println(agua.lavarLouca());
			}
		}
	}
}
