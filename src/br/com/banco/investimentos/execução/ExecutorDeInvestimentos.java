package br.com.banco.investimentos.execução;

import br.com.banco.investimentos.conta.Conta;
import br.com.banco.investimentos.interfaces.Investimento;

public class ExecutorDeInvestimentos {
	
	public void realiza(Conta conta, Investimento investimento) {
        double resultado = investimento.calcula(conta);

        conta.deposita( resultado * 0.75 );
        System.out.println ( "Novo saldo: " + conta.getSaldo());
      }

}
