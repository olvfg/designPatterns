package com.designpatterns.designpatterns.builder.after;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import com.designpatterns.builder.after.PizzaLombok;

public class PizzaLombokTest {

	@Test
	public void deveAdicionarPizza() {
		PizzaLombok pizza = PizzaLombok.builder()
				.tamanho(10)
				.queijo(true)
				.tomate(false)
				.build();
		
		assertThat(pizza.getTamanho()).isEqualTo(10);
		assertThat(pizza.isQueijo()).isEqualTo(true);
		assertThat(pizza.isTomate()).isEqualTo(false);
	}

}
