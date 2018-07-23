package br.com.curso.padraoprojeto.pasta1;

import br.com.curso.padraoprojeto.pasta2.Item;

public class DescontoPorVendaCasada implements Desconto {
	
	private Desconto proximo;

    public double desconta(Or�amento or�amento) {
        if(aconteceuVendaCasadaEm(or�amento)) return or�amento.getValor() * 0.05;
        else return proximo.desconta(or�amento);
    }

    private boolean aconteceuVendaCasadaEm(Or�amento or�amento) {
        return existe("CANETA", or�amento) && existe("LAPIS", or�amento);
    }

    private boolean existe(String nomeDoItem, Or�amento or�amento) {
        for (Item item : or�amento.getItens()) {
            if(item.getNome().equals(nomeDoItem)) return true;
        }
        return false;
    }

    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }

}
