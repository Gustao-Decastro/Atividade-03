package Modelagem;

import javax.swing.JOptionPane;

public class Pilha {
	private Computador[] itens;
    private int topo;

    public Pilha(int capacidade) {
        itens = new Computador[capacidade];
        topo = -1;
    }

    public void empilhar(Computador item) {
        if (topo < itens.length - 1) {
            itens[++topo] = item;
        } else {
            JOptionPane.showMessageDialog(null, "A pilha está cheia!");
        }
    }

    public Computador desempilhar() {
        if (topo >= 0) {
            return itens[topo--];
        } else {
            JOptionPane.showMessageDialog(null, "A pilha está vazia!");
            return null;
        }
    }
}


