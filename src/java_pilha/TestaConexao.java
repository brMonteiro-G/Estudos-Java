package java_pilha;

public class TestaConexao {

	public static void main(String[] args) {
		
		//try-with-resources 
		
		try(Conexao conexao = new Conexao()){
			conexao.leDados();
		}catch(IllegalStateException ex) {
			System.out.println("Erro de conexão");
		}finally {
			System.out.println("O bloco finally é sempre executado");
		}
		
		
		
//		Conexao c = null;
//		try {
//			c = new Conexao();
//			c.leDados();;
//			c.fecha();
//		}catch(IllegalStateException ex) {
//			if(c != null) {
//				System.out.println("Erro de conexão");
//			}
//			
//		}finally {
//			c.fecha();
//
//		}
//	
//		
	}
	
	}
