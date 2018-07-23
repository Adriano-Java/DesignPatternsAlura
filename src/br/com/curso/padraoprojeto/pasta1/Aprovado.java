package br.com.curso.padraoprojeto.pasta1;

public class Aprovado implements EstadoDeUmOr�amento {
	
	private boolean descontoAplicado = false;
	   
	public void aplicaDescontoExtra(Or�amento or�amento) {
		if(!descontoAplicado) {
	        or�amento.valor -= or�amento.valor * 0.02;
	        descontoAplicado = true;
	      }
	      else {
	        throw new RuntimeException("Desconto j� aplicado!");
	      }
	}

	@Override
	public void aprova(Or�amento or�amento) {
		throw new RuntimeException("Or�amento j� aprovado!");
	}

	@Override
	public void reprova(Or�amento or�amento) {
		throw new RuntimeException("Or�amentos aprovados n�o podem ser reprovados!");
	}

	@Override
	public void finaliza(Or�amento or�amento) {
		or�amento.estadoAtual = new Finalizado();
	}

}
