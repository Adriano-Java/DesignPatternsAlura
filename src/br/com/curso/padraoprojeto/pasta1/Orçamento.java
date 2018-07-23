package br.com.curso.padraoprojeto.pasta1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.curso.padraoprojeto.pasta2.Item;

public class Orçamento {
	
	protected double valor;
	private final List<Item> itens;
	protected EstadoDeUmOrçamento estadoAtual;

	public Orçamento (double valor) {
		this.valor = valor;
		itens = new ArrayList<Item>();
		estadoAtual = new EmAprovação();
	}

	public double getValor() {
		return valor;
	}
	
	public void adicionaItem(Item item) {
		itens.add(item);
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
	}
	
	public void aprova(){
		estadoAtual.aprova(this);
	}
	
	public void reprova(){
		estadoAtual.reprova(this);
	}
	
	public void finaliza(){
		estadoAtual.finaliza(this);
	}

}
