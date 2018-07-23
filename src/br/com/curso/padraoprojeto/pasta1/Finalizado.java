package br.com.curso.padraoprojeto.pasta1;

public class Finalizado implements EstadoDeUmOr�amento{

	@Override
	public void aplicaDescontoExtra(Or�amento or�amento) {
		throw new RuntimeException("Or�amentos finalizados n�o recebem desconto extra!");
	}

	@Override
	public void aprova(Or�amento or�amento) {
		throw new RuntimeException("Or�ametno finalizado!");
		
	}

	@Override
	public void reprova(Or�amento or�amento) {
		throw new RuntimeException("Or�ametno finalizado!");
		
	}

	@Override
	public void finaliza(Or�amento or�amento) {
		throw new RuntimeException("Or�ametno finalizado!");
		
	}

}
