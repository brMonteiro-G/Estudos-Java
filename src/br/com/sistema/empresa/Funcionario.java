package br.com.sistema.empresa  ;

public abstract class Funcionario {
	
	
	private String nome; 
	private String cpf;
	private double salario; 
	
	public Funcionario() {}
	
	public abstract double getBonificacao(); //{ métods abstratos só possuem a assinatura, sem corpo. 
		//return  this.salario * 0.1;
//}
	
	
	public String getNome() {
		return nome ;
		
	}
	
	public void setNome(String nome) {
		this.nome = nome ;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	

}
