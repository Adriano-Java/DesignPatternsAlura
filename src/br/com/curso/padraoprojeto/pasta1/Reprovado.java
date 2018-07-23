package br.com.curso.padraoprojeto.pasta1;

public class Reprovado implements EstadoDeUmOrçamento {

	@Override
	public void aplicaDescontoExtra(Orçamento orçamento) {
		throw new RuntimeException("Orçamentos reprovados não recebem desconto extra!");
	}

	@Override
	public void aprova(Orçamento orçamento) {
		throw new RuntimeException("Orçamentos reprovados não podem ser aprovados!");
	}

	@Override
	public void reprova(Orçamento orçamento) {
		throw new RuntimeException("Orçamento já está reprovado!");
	}

	@Override
	public void finaliza(Orçamento orçamento) {
		orçamento.estadoAtual = new Finalizado();
	}

}
