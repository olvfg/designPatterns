package com.designpatterns.builder.before;

public class Pizza {
	
	private int tamanho;
	private boolean queijo;
	private boolean tomate;
	
	public Pizza(int tamanho, boolean queijo, boolean tomate) {
		this.tamanho = tamanho;
		this.queijo = queijo;
		this.tomate = tomate;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public boolean isQueijo() {
		return queijo;
	}
	public void setQueijo(boolean queijo) {
		this.queijo = queijo;
	}
	public boolean isTomate() {
		return tomate;
	}
	public void setTomate(boolean tomate) {
		this.tomate = tomate;
	}
}
