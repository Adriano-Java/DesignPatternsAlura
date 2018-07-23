package br.com.curso.padraoprojeto.pasta1;

import br.com.curso.padraoprojeto.pasta2.Item;

public class DescontoPorVendaCasada implements Desconto {
	
	private Desconto proximo;

    public double desconta(Orçamento orçamento) {
        if(aconteceuVendaCasadaEm(orçamento)) return orçamento.getValor() * 0.05;
        else return proximo.desconta(orçamento);
    }

    private boolean aconteceuVendaCasadaEm(Orçamento orçamento) {
        return existe("CANETA", orçamento) && existe("LAPIS", orçamento);
    }

    private boolean existe(String nomeDoItem, Orçamento orçamento) {
        for (Item item : orçamento.getItens()) {
            if(item.getNome().equals(nomeDoItem)) return true;
        }
        return false;
    }

    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }

}
