package br.com.bytebank.banco.teste;



import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {
    public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList<>();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);

        System.out.println("Tamanho: " + lista.size());

        Conta ref = lista.get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);
        System.out.println("Tamanho: " + lista.size());

        Conta cc3 = new ContaCorrente(33, 311);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(33, 322);
        lista.add(cc4);

        for(int i = 0; i < lista.size(); i++) {
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }

        System.out.println("----------");
        
        //enhanced-for
        for(Object oRef : lista) {
            System.out.println(oRef);
        }
        
        ArrayList lista1 = new ArrayList(26); //capacidade inicial
        lista1.add("RJ");
        lista1.add("SP");
        //outros estados
        ArrayList nova = new ArrayList(lista1); //criando baseado na primeira lista
        
        
        System.out.println(nova.get(0));

    }
    
    
    List<Conta> lista = new Vector<Conta>();// vector é threadSafe
    
    Collection<Conta> list1 = new Vector<Conta>();// Collection é a interface mãe p/ set e lists
    
   Conta ca = new ContaCorrente(23,56);
   
    
}

