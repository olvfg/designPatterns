package com.designpatterns.strategy.after;

public class CalculadoraDeImposto {
	
	public double calcular(Imposto imposto) {
		return imposto.calcular();
	}

}
