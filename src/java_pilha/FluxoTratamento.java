package java_pilha;
public class FluxoTratamento {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    
   
    private static void metodo2() {
        System.out.println("Ini do metodo2");
        
       // NullPointerException ex = new NullPointerException();
        //throw ex;
       
        
        throw new NullPointerException("Erro de referência null");
        // metodo1(); --> unreachable code 
        
    }
    
    
  
}
