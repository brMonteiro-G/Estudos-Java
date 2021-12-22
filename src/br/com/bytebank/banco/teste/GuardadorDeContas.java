package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;

public class GuardadorDeContas {
	
	private Conta[] referencias; 
	private static int soma; 
	private int posicaoLivre; 
	
	public GuardadorDeContas() {
		this.referencias = new Conta[10];
		this.posicaoLivre = 0 ;
	}

	public String adiciona(Conta conta) {
		referencias[posicaoLivre]= conta; 
		GuardadorDeContas.soma ++; 
		return "Adicionado com sucesso";
	}

	public static int getSoma() {
		return soma;
	}

	
	
	
}
