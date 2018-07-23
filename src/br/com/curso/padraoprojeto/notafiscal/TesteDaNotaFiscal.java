package br.com.curso.padraoprojeto.notafiscal;

public class TesteDaNotaFiscal {
	
	public static void main(String[] args) {
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.paraEmpresa("F�brica de Farinha Extrema LTDA")
		.comCnpj("12.345.678/0001-12")
		.com(new ItemDaNota("item 1", 200.0))
		.com(new ItemDaNota("item 2", 300.0))
		.com(new ItemDaNota("item 3", 400.0))
		.com(new ItemDaNota("item 4", 500.0))
		.comObserva��es("Esta nota � apenas um teste. N�o possui valor fscal.")
		.naDataAtual();
		
		NotaFiscal nf = builder.constr�i();
		
		System.out.println(nf.getValorBruto());
	}

}
