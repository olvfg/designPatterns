package com.designpatterns.designpatterns.builder.after;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

import com.designpatterns.builder.after.Pizza;

public class PizzaTest {

	@Test
	public void deveAdicionarPizza() {
		Pizza pizza = new Pizza
				.Builder(10)
				.queijo()
				.tomate()
				.build();
		
		assertThat(pizza.getTamanho()).isEqualTo(10);
		assertThat(pizza.isQueijo()).isEqualTo(true);
		assertThat(pizza.isTomate()).isEqualTo(true);
	}

}
