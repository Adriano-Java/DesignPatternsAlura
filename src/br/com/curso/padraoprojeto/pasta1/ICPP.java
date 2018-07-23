package br.com.curso.padraoprojeto.pasta1;

public class ICPP extends TemplateDeImpostoCondicional{
	
	public ICPP(){
		
	}
	
	public ICPP(Imposto outroImposto){
		super(outroImposto);
	}

	@Override
	public double maximaTaxacao(Or�amento or�amento) {
		return or�amento.getValor() * 0.05;
	}

	@Override
	public double minimaTaxacao(Or�amento or�amento) {
		return or�amento.getValor() * 0.07;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Or�amento or�amento) {
		return or�amento.getValor() > 500;
	}

}
