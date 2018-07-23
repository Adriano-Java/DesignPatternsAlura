package br.com.curso.padraoprojeto.notafiscal;

public class TestaA��es {

	public static void main(String[] args) {

		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.adicionaA��o(new EnviadorDeEmail());
		builder.adicionaA��o(new NotaFiscalDao());
		builder.adicionaA��o(new EnviaPorSms());
		builder.adicionaA��o(new Impressora());

		NotaFiscal nf = builder.paraEmpresa("Farinha Extrema LTDA").comCnpj("12.384.765/0001-19")
				.com(new ItemDaNota("Mandioca branca", 100.0)).naDataAtual().comObserva��es("Mandioca fresca")
				.constr�i();
		
		System.out.println(nf.getValorBruto());
	}

}
