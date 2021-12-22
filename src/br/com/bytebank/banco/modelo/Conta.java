package br.com.bytebank.banco.modelo;

/**
 * 
 * @author gabriel
 *
 */

public abstract class Conta {

	protected double saldo; // default --> private package
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;

	// public Conta() {}
	
	
	/**
	 * Construtor para inicializar o objeto Conta a partir da agencia e numero
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		Conta.total++;
		// System.out.println("O total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;
		// System.out.println("Estou criando uma conta" + this.numero);
	}

	public abstract void deposita(double valor) throws SaldoInsuficienteException;
	
	
	/**
	 * Método para saque com validação de saldo 
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void saque(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}

		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		
			this.saque(valor);
			destino.deposita(valor);
			
	}
	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public boolean equals(Object ref){
		
		Conta conta = (Conta) ref; 
		
		if(this.agencia != conta.agencia || this.numero != conta.numero) {
			return false;
		}
		return true ;
	}

	@Override
	public String toString() {
		
		return "Número " + this.numero + " Agência " + this.agencia +  " ";
	}
	
}
