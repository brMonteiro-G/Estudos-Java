package bytebank_herança_conta;

	

public class TestaConta {

	public static void main(String[] args) throws SaldoInsuficienteException{
		
		ContaCorrente cc = new ContaCorrente(123, 577);
		ContaPoupanca cp = new ContaPoupanca(523, 378); 
		
		
		cc.deposita(580.0);
		cp.deposita(390.0);
		
		
		cc.transfere(5900.0, cp);
		
		
		System.out.println("Saldo da conta corrente: " + cc.getSaldo());
		System.out.println("Saldo da conta poupanca: " + cp.getSaldo());
		
		
		CalculadoraImposto ci = new CalculadoraImposto();
		
		ci.registra(cc);
		
		System.out.println(ci.getTotalImposto());
		
		
		
		
	}
	
}
