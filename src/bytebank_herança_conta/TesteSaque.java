package bytebank_herança_conta;

public class TesteSaque {
	public static void main(String[] args) {
		
		Conta c = new ContaCorrente(222,874);

		try {
			c.saque(2500);

		}catch(SaldoInsuficienteException ex) {
			System.out.println("Exceção --> \n" + ex.getMessage() + "\n Na pilha -->" );
			ex.printStackTrace();
		}
		
        System.out.println(c.getSaldo());

		
		
	}

	

	
	
}
