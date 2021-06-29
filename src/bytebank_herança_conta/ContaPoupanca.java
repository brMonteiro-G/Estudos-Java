package bytebank_herança_conta;

public class ContaPoupanca extends Conta {

	
	
	public ContaPoupanca(int agencia1 , int numero1 ) {
		
		
		super(agencia1, numero1);
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
	}

}
