package bytebank_herança_conta;

public class SeguroDeVida implements Tributavel {

	@Override
	public double getValorImposto() {
		return 50.0;
	}

}
