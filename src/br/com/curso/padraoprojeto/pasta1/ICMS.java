package br.com.curso.padraoprojeto.pasta1;

public class ICMS extends Imposto {
	
	public ICMS(){
		
	}
	
	public ICMS(Imposto outroImposto){
		super(outroImposto);
	}
	
	@Override
	public double calcula(Orçamento orçamento) {
		return orçamento.getValor() * 0.1 + 50.0 + calculoDoOutroImposto(orçamento);
	}

}
