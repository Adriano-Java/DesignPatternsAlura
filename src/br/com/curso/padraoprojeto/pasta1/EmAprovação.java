package br.com.curso.padraoprojeto.pasta1;

public class EmAprovação implements EstadoDeUmOrçamento {
	
	private boolean descontoAplicado = false;
   
	public void aplicaDescontoExtra(Orçamento orçamento) {
		if(!descontoAplicado) {
	        orçamento.valor -= orçamento.valor * 0.05;
	        descontoAplicado = true;
	      }
	      else {
	        throw new RuntimeException("Desconto já aplicado!");
	      }
	}

	@Override
	public void aprova(Orçamento orçamento) {
		orçamento.estadoAtual = new Aprovado();
	}

	@Override
	public void reprova(Orçamento orçamento) {
		orçamento.estadoAtual = new Reprovado();
	}

	@Override
	public void finaliza(Orçamento orçamento) {
		throw new RuntimeException("Orçamentos em aprovação não podem ser finalizados!");
	}

}
