package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;


public class TestaConta {

	public static void main(String[] args) throws SaldoInsuficienteException{
		
		ContaCorrente cc = new ContaCorrente(123, 577);
		ContaPoupanca cp = new ContaPoupanca(523, 378); 
		
		
		cc.deposita(580.0);
		cp.deposita(390.0);
		
		
		cc.transfere(100.0, cp);
		
		
		System.out.println(cc + "Saldo da conta  " + cc.getSaldo());
		System.out.println(cp + "Saldo da conta  " + cp.getSaldo());
		
		
		CalculadoraImposto ci = new CalculadoraImposto();
		
		ci.registra(cc);
		
		System.out.println(ci.getTotalImposto());
		
		
		
		
	}
	
}
