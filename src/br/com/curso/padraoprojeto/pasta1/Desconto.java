package br.com.curso.padraoprojeto.pasta1;

public interface Desconto {
	
	double desconta (Orçamento orçamento);
	void setProximo(Desconto proximo);

}
