package br.com.curso.padraoprojeto.pasta1;

public class SemDesconto implements Desconto {

	@Override
	public double desconta(Or�amento or�amento) {
		return 0;
	}

	@Override
	public void setProximo(Desconto proximo) {
	}

}
