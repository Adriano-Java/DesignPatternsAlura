package br.com.curso.padraoprojeto.pasta1;

public class DescontoPorMaisDeCincoItens implements Desconto {
	private Desconto proximo;

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

	@Override
	public double desconta(Or�amento or�amento) {
		if(or�amento.getItens().size() > 5) {
			return or�amento.getValor() *0.1;
		}
		else {
			return proximo.desconta(or�amento);
		}
	}

}
