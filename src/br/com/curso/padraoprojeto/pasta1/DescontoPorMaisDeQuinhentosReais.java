package br.com.curso.padraoprojeto.pasta1;

public class DescontoPorMaisDeQuinhentosReais implements Desconto {
		private Desconto proximo;

		@Override
		public void setProximo(Desconto proximo) {
			this.proximo = proximo;
		}

		@Override
		public double desconta(Orçamento orçamento) {
			if(orçamento.getValor() > 500) {
				return orçamento.getValor() *0.07;
			}
			else {
				return proximo.desconta(orçamento);
			}
		}

}
