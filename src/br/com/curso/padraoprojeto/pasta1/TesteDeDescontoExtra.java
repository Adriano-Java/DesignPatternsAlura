package br.com.curso.padraoprojeto.pasta1;

public class TesteDeDescontoExtra {
	
	public static void main(String[] args) {
		Orçamento reforma = new Orçamento(500.0);
		
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
