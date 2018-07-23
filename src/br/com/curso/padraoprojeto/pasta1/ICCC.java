package br.com.curso.padraoprojeto.pasta1;

public class ICCC extends Imposto {
	
	public ICCC(){
		
	}
	
	public ICCC(Imposto outroImposto){
		super(outroImposto);
	}
	
	public double calcula(Or�amento or�amento) {
		
        if(or�amento.getValor() < 1000) {
          return or�amento.getValor() * 0.05;
        	}
        
        else if (or�amento.getValor() <= 3000) {
          return or�amento.getValor() * 0.07;
        	}
        
        else {
          return or�amento.getValor() * 0.08 + 30;
        	}
        
      }

}
