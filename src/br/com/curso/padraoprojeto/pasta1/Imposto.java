package br.com.curso.padraoprojeto.pasta1;

public abstract class Imposto {
	
	protected Imposto outroImposto;
	
	public Imposto (Imposto outroImposto){
		this.outroImposto = outroImposto;
	}
	
	public Imposto(){}
	
	public abstract double calcula(Or�amento or�amento);
	
	protected double calculoDoOutroImposto(Or�amento or�amento){
		if(outroImposto == null) return 0;
		return outroImposto.calcula(or�amento);
	}

}
