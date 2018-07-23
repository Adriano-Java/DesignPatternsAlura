package br.com.banco.investimentos.relatorio;

import java.util.List;

import br.com.banco.investimentos.conta.Conta;

abstract class Relatório {
	
	 protected abstract void cabecalho();
     protected abstract void rodape();
     protected abstract void corpo(List<Conta> contas);

     public void imprime(List<Conta> contas) {
       cabecalho();
       corpo(contas);
       rodape();
     }

}
