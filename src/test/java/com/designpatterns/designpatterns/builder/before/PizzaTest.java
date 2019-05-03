package com.designpatterns.designpatterns.builder.before;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import com.designpatterns.builder.before.Pizza;

public class PizzaTest {
	
	@Test
	public void deveAdicionarPizza() {
		
		Pizza pizza = new Pizza(10, true, false);
		
		assertThat(pizza.getTamanho()).isEqualTo(10);
		assertThat(pizza.isQueijo()).isEqualTo(true);
		assertThat(pizza.isTomate()).isEqualTo(false);
	}
}
