package Modelagem;
import javax.swing.JOptionPane;

public class Computador {
	private String marca;
	private String modelo;
	private int ano;
	
	public Computador (String marca, String modelo, int ano) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		
		
	}
	
	public String getMarca() {
		
		return marca;
		
	}
	
	public String getModelo() {
		
		return modelo;
		
	}
	
	public int getAno() {
		
		return ano;
		
	}

}
