package br.com.curso.padraoprojeto.pasta1;

public class Reprovado implements EstadoDeUmOr�amento {

	@Override
	public void aplicaDescontoExtra(Or�amento or�amento) {
		throw new RuntimeException("Or�amentos reprovados n�o recebem desconto extra!");
	}

	@Override
	public void aprova(Or�amento or�amento) {
		throw new RuntimeException("Or�amentos reprovados n�o podem ser aprovados!");
	}

	@Override
	public void reprova(Or�amento or�amento) {
		throw new RuntimeException("Or�amento j� est� reprovado!");
	}

	@Override
	public void finaliza(Or�amento or�amento) {
		or�amento.estadoAtual = new Finalizado();
	}

}
