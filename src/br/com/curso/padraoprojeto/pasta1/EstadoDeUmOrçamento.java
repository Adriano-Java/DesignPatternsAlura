package br.com.curso.padraoprojeto.pasta1;

public interface EstadoDeUmOr�amento {
	
	void aplicaDescontoExtra(Or�amento or�amento);
	
	void aprova (Or�amento or�amento);
	void reprova (Or�amento or�amento);
	void finaliza (Or�amento or�amento);

}
