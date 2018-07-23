package br.com.curso.padraoprojeto.pasta1;

public class Aprovado implements EstadoDeUmOrçamento {
	
	private boolean descontoAplicado = false;
	   
	public void aplicaDescontoExtra(Orçamento orçamento) {
		if(!descontoAplicado) {
	        orçamento.valor -= orçamento.valor * 0.02;
	        descontoAplicado = true;
	      }
	      else {
	        throw new RuntimeException("Desconto já aplicado!");
	      }
	}

	@Override
	public void aprova(Orçamento orçamento) {
		throw new RuntimeException("Orçamento já aprovado!");
	}

	@Override
	public void reprova(Orçamento orçamento) {
		throw new RuntimeException("Orçamentos aprovados não podem ser reprovados!");
	}

	@Override
	public void finaliza(Orçamento orçamento) {
		orçamento.estadoAtual = new Finalizado();
	}

}
