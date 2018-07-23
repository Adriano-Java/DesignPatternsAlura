package br.com.curso.padraoprojeto.pasta1;

public class Finalizado implements EstadoDeUmOrçamento{

	@Override
	public void aplicaDescontoExtra(Orçamento orçamento) {
		throw new RuntimeException("Orçamentos finalizados não recebem desconto extra!");
	}

	@Override
	public void aprova(Orçamento orçamento) {
		throw new RuntimeException("Orçametno finalizado!");
		
	}

	@Override
	public void reprova(Orçamento orçamento) {
		throw new RuntimeException("Orçametno finalizado!");
		
	}

	@Override
	public void finaliza(Orçamento orçamento) {
		throw new RuntimeException("Orçametno finalizado!");
		
	}

}
