package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;


/**
 * Classe utilizada para entender o conceito do modificador de acesso private package
 * @author gabriel
 * 
 */
public class ContaEspecial extends Conta {

	ContaEspecial(int agencia, int numero){
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) throws SaldoInsuficienteException {

		
	}
	
	
}
