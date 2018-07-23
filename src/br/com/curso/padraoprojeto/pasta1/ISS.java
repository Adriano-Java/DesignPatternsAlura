package br.com.curso.padraoprojeto.pasta1;

public class ISS extends Imposto {
	
	public ISS(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public ISS(){
		
	}
	
	@Override
	public double calcula(Orçamento orçamento) {
		return orçamento.getValor() * 0.06 + calculoDoOutroImposto(orçamento);
	}

}
