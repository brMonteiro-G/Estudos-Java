
public class Vendedor extends Funcionario{
	
	public double getBonificacao() {
	  return 100 + super.getSalario() ; 
	} 

}
