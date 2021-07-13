package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;



public class TestaContaComExcecaoChecked {

	public static void main(String[] args) {
		
		Conta c = new ContaCorrente(287,987); 
		
		try {
			c.deposita(5000.0);
		}catch(Exception ex) {
			System.out.println("Tratamento de erro...");
		}
		
		
	}
	
}
