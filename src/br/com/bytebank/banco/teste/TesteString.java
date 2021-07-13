package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "  Miguel Rodrigues Monteiro"  ; 
		
		String name =  nome.replace("e", "E");
		
		System.out.println(name);
		
		String maiusculo = nome.toUpperCase();
		
		System.out.println(maiusculo);
		
		int indexOf = nome.indexOf("uel");
		
		System.out.println(indexOf);
		
		char char1 = nome.charAt(3);
		
		System.out.println(char1);
		
		
		String sub = nome.substring(15);
		System.out.println(sub);

		
		for(char l=0 ;l<nome.length() ; l++ ) {
			char laco = nome.charAt(l);
			System.out.println(laco);
		}
		
		String trim = nome.trim();
		System.out.println(trim);
		
		 System.out.println("abc");
	     String cde = "cde";
	     System.out.println("abc" + cde);
	     String c = "abc".substring(2,3);
	     String d = cde.substring(1, 2);
	     System.out.println(c);
	     System.out.println(d);

	     
	     String nome2 = "Gabriel"; 
	     String sube = nome2.substring(1,2);
	     System.out.println(sube);
	     
	     
	     String valor = "DEVMEDIA - Java - Engenharia - Software";
	     String[] valorComSplit = valor.split("-", 2 );

	     for(String s : valorComSplit){
	            System.out.println(s);
	     }
	     
	     
	     if(nome.contains("e")) {
	    	 System.out.println("teste contains");
	     }
	}
	
	
	
}
