package br.com.curso.padraoprojeto.pasta1;

public class DescontoPorMaisDeQuinhentosReais implements Desconto {
		private Desconto proximo;

		@Override
		public void setProximo(Desconto proximo) {
			this.proximo = proximo;
		}

		@Override
		public double desconta(Or�amento or�amento) {
			if(or�amento.getValor() > 500) {
				return or�amento.getValor() *0.07;
			}
			else {
				return proximo.desconta(or�amento);
			}
		}

}
