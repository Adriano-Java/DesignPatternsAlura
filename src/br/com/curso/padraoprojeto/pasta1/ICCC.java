package br.com.curso.padraoprojeto.pasta1;

public class ICCC extends Imposto {
	
	public ICCC(){
		
	}
	
	public ICCC(Imposto outroImposto){
		super(outroImposto);
	}
	
	public double calcula(Orçamento orçamento) {
		
        if(orçamento.getValor() < 1000) {
          return orçamento.getValor() * 0.05;
        	}
        
        else if (orçamento.getValor() <= 3000) {
          return orçamento.getValor() * 0.07;
        	}
        
        else {
          return orçamento.getValor() * 0.08 + 30;
        	}
        
      }

}
