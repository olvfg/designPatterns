package com.designpatterns.builder.after;

public class Pizza {
	
	private int tamanho;
	private boolean queijo;
	private boolean tomate;
	
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

	public static class Builder {
		
		// requerido
		private final int tamanho;
		
		// opcional
		private boolean queijo = false;
		private boolean tomate = false;
		
		public Builder(int tamanho) {
			this.tamanho = tamanho;
		}

		public Builder queijo() {
			queijo = true;
			return this;
		}

		public Builder tomate() {
			tomate = true;
			return this;
		}
		
		public Pizza build() {
			return new Pizza(this);
		}
	}
	
	private Pizza(Builder builder) {
		tamanho = builder.tamanho;
		queijo = builder.queijo;
		tomate = builder.tomate;
	}
}
