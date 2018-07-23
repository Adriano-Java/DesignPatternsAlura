package br.com.curso.padraoprojeto.pasta1;

public interface EstadoDeUmOrçamento {
	
	void aplicaDescontoExtra(Orçamento orçamento);
	
	void aprova (Orçamento orçamento);
	void reprova (Orçamento orçamento);
	void finaliza (Orçamento orçamento);

}
