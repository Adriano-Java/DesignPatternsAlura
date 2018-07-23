package br.com.curso.padraoprojeto.pasta1;

public class DescontoPorMaisDeCincoItens implements Desconto {
	private Desconto proximo;

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

	@Override
	public double desconta(Orçamento orçamento) {
		if(orçamento.getItens().size() > 5) {
			return orçamento.getValor() *0.1;
		}
		else {
			return proximo.desconta(orçamento);
		}
	}

}
