package br.com.curso.padraoprojeto.pasta1;

public class EmAprova��o implements EstadoDeUmOr�amento {
	
	private boolean descontoAplicado = false;
   
	public void aplicaDescontoExtra(Or�amento or�amento) {
		if(!descontoAplicado) {
	        or�amento.valor -= or�amento.valor * 0.05;
	        descontoAplicado = true;
	      }
	      else {
	        throw new RuntimeException("Desconto j� aplicado!");
	      }
	}

	@Override
	public void aprova(Or�amento or�amento) {
		or�amento.estadoAtual = new Aprovado();
	}

	@Override
	public void reprova(Or�amento or�amento) {
		or�amento.estadoAtual = new Reprovado();
	}

	@Override
	public void finaliza(Or�amento or�amento) {
		throw new RuntimeException("Or�amentos em aprova��o n�o podem ser finalizados!");
	}

}
