package Modelagem;

import javax.swing.JOptionPane;

public class Visao {

	public static void main(String[] args) {
		  Pilha pilha = new Pilha(5); // Por exemplo, uma pilha com capacidade para 5 computadores

	        while (true) {
	            int opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n1 - Empilhar\n2 - Desempilhar\n3 - Sair"));

	            switch (opcao) {
	                case 1:
	                    String marca = JOptionPane.showInputDialog("Digite a marca do computador:");
	                    String modelo = JOptionPane.showInputDialog("Digite o modelo do computador:");
	                    int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do computador:"));
	                    Computador novoComputador = new Computador(marca, modelo, ano);
	                    pilha.empilhar(novoComputador);
	                    JOptionPane.showMessageDialog(null, "Computador empilhado com sucesso!");
	                    break;
	                case 2:
	                    Computador computadorDesempilhado = pilha.desempilhar();
	                    if (computadorDesempilhado != null) {
	                        JOptionPane.showMessageDialog(null, "Computador desempilhado:\nMarca: " + computadorDesempilhado.getMarca() +
	                                "\nModelo: " + computadorDesempilhado.getModelo() + "\nAno: " + computadorDesempilhado.getAno());
	                    }
	                    break;
	                case 3:
	                    System.exit(0);
	                    break;
	                default:
	                    JOptionPane.showMessageDialog(null, "Opção inválida!");
	            }
	        }
	    }
	

	}


