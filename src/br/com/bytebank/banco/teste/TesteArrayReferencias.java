package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
	Conta[] contas = new Conta[5]; 
	
	ContaCorrente cc1 = new ContaCorrente(232, 02);	
	contas[0] = cc1; 
	
	ContaPoupanca cc2 = new ContaPoupanca(231, 07);	
	contas[1] = cc2; 
	
	
	System.out.println(contas[1].getNumero());
	
	ContaPoupanca ref = (ContaPoupanca)contas[1]; //como a classe conta é genérica, precisamos fazer um cast para especificar para o array 
	
	System.out.println(cc2.getNumero());
	
	System.out.println(ref.getNumero());
	
	}
	
}
