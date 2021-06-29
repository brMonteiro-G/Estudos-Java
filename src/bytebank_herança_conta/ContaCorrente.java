package bytebank_herança_conta;

public class ContaCorrente extends Conta implements Tributavel{
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
			}
	

	@Override
	public void deposita(double valor) {
		 this.saldo += valor ; 
	}

	
	@Override
	public void saque(double valor) throws SaldoInsuficienteException  {
	
		double valorASacar = valor + 0.5;
		
		super.saque(valorASacar);
	}


	@Override
	public double getValorImposto() {

		return super.saldo * 0.1;
	}

}
