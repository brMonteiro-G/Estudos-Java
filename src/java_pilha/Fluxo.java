package java_pilha;

public class Fluxo {

    public static void main(String[] args) throws MinhaOutraExcecao  { //Assinatura de exceções do tipo checked
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
        throw new MinhaOutraExcecao("Erro");
    }

    private static void metodo1(){ 
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
        
    }

    
   
    private static void metodo2() {
        System.out.println("Ini do metodo2");
        try {
        	for(int i = 1; i <= 5; i++) {
                System.out.println(i);
               int  a = 10/0;
               teste c = null;
               c.method();
            }
            System.out.println("Fim do metodo2");
        }catch(Exception  ex) {
        	
        	
        	System.out.print( ex.getMessage() + "Erro causado por \n");
        	ex.printStackTrace(); 
        }
        
    }
}
