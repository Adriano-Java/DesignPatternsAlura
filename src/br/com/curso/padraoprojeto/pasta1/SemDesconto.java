package br.com.curso.padraoprojeto.pasta1;

public class SemDesconto implements Desconto {

	@Override
	public double desconta(Orçamento orçamento) {
		return 0;
	}

	@Override
	public void setProximo(Desconto proximo) {
	}

}
