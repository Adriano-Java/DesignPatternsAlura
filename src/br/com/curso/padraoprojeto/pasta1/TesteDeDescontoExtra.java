package br.com.curso.padraoprojeto.pasta1;

public class TesteDeDescontoExtra {
	
	public static void main(String[] args) {
		Or�amento reforma = new Or�amento(500.0);
		
		reforma.aplicaDescontoExtra();
		
		System.out.println(reforma.getValor());
		
		reforma.aprova();
		
		reforma.aplicaDescontoExtra();
		
		System.out.println(reforma.getValor());
		
		reforma.finaliza();
		
		reforma.aplicaDescontoExtra();
		
		System.out.println(reforma.getValor());
	}

}
