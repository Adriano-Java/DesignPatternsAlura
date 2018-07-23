package br.com.curso.padraoprojeto.pasta1;

public class ISS extends Imposto {
	
	public ISS(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public ISS(){
		
	}
	
	@Override
	public double calcula(Or�amento or�amento) {
		return or�amento.getValor() * 0.06 + calculoDoOutroImposto(or�amento);
	}

}
