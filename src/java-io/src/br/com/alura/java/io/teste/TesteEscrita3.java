import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class TesteEscrita3 {
	public static void main(String[] args) throws IOException {
		
		//PrintStream ps = new PrintStream("lorem2.txt"); 
		//ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		//ps.println();
		//ps.println("asaaadadad dafad ds sds"); 
		
		//ps.close();
		
	

		        long ini = System.currentTimeMillis();

		        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));

		        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		        bw.newLine();
		        bw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");

		        bw.close();

		        long fim = System.currentTimeMillis();

		        System.out.println("Passaram " + (fim - ini) + " milissegundos");

		    }
	
}
