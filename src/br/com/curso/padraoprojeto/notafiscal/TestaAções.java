package br.com.curso.padraoprojeto.notafiscal;

public class TestaAções {

	public static void main(String[] args) {

		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.adicionaAção(new EnviadorDeEmail());
		builder.adicionaAção(new NotaFiscalDao());
		builder.adicionaAção(new EnviaPorSms());
		builder.adicionaAção(new Impressora());

		NotaFiscal nf = builder.paraEmpresa("Farinha Extrema LTDA").comCnpj("12.384.765/0001-19")
				.com(new ItemDaNota("Mandioca branca", 100.0)).naDataAtual().comObservações("Mandioca fresca")
				.constrói();
		
		System.out.println(nf.getValorBruto());
	}

}
