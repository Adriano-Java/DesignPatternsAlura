package br.com.banco.investimentos.conta;

public class Conta {
	
	private String nome;
	private int agencia;
	private long numero;
	private double saldo;
	
	public void deposita (double valor) {
		this.saldo += valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getNome() {
		return nome;
	}

	public long getNumero() {
		return numero;
	}

	public int getAgencia() {
		return agencia;
	}

}
