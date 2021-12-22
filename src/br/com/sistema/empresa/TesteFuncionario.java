package br.com.sistema.empresa  ;
public class TesteFuncionario {

	
	public static void main(String[] args) {
		
	Gerente gabriel = new Gerente(); 
	gabriel.setNome("Gabriel Monteiro"); 
	gabriel.setSalario(7000.0);
		
	Funcionario antonio = new Vendedor(); 
	antonio.setSalario(2500.0);
	
//	Funcionario teste = new Funcionario();não mais permitido devido a configuração abstract  
	
	Estoquista jefferson = new Estoquista(); 
	jefferson.setSalario(1600.0);
	
	ControleBonificacao controle = new ControleBonificacao();
	controle.registra(jefferson);
	controle.registra(gabriel);
	controle.registra(antonio);
	
	System.out.println(controle.getSoma());

		
	}
	
}
