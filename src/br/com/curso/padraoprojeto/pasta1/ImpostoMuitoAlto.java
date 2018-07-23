package br.com.curso.padraoprojeto.pasta1;

public class ImpostoMuitoAlto extends Imposto{

	public ImpostoMuitoAlto(Imposto imposto) {
        super(imposto);
    }

    public ImpostoMuitoAlto() {
        super();
    }
	
	@Override
	public double calcula(Or�amento or�amento) {
		return or�amento.getValor() * 0.2 + calculoDoOutroImposto(or�amento);
	}

}
