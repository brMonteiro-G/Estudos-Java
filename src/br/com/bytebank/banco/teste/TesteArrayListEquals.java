package br.com.bytebank.banco.teste;



import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {
	public static void main(String[] args){

	    ArrayList<Conta> lista = new ArrayList<Conta>();

	    Conta cc1 = new ContaCorrente(22, 22);
	    Conta cc2 = new ContaCorrente(22, 22);

	    lista.add(cc1);
	    // contains usando o método equals por baixo dos panos. 
	    if(lista.contains(cc2)) {
	    	System.out.println("contém");
	    }else{
	    	System.out.println("n contém");

	    };

	    for(Conta conta : lista){
	        System.out.println(conta);
	    }
	}
}
