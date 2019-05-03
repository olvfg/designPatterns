package com.designpatterns.builder.after;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PizzaLombok {
	
	private int tamanho;
	private boolean queijo;
	private boolean tomate;
}
