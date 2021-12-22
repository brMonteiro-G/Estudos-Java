package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteGuardadorDeContas {

	public static void main(String[] args) {
		
		GuardadorDeContas guarda = new GuardadorDeContas();
		
		 Conta cc = new ContaCorrente(22,11);
		
		guarda.adiciona(cc);
		
		Conta cp  =  new ContaPoupanca(21, 13);
		
		guarda.adiciona(cp);
		
		Conta cd = new ContaCorrente(99, 13);
		guarda.adiciona(cd);
		
		System.out.println(guarda.adiciona(cc));
		System.out.println(guarda.adiciona(cp));
		
		System.out.println(GuardadorDeContas.getSoma());
	}

}
