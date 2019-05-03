package com.designpatterns.designpatterns.strategy.before;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Before;
import org.junit.Test;

import com.designpatterns.strategy.before.CalculadoraDeImpostos;

public class CalculadoraDeImpostosTest {
	
	private CalculadoraDeImpostos calculadora;
	
	@Before
	public void setUp() {
		calculadora = new CalculadoraDeImpostos();
	}
	
	@Test
	public void deveCalcularICMS() {
		assertThat(calculadora.calcular("ICMS", 100.00)).isEqualTo(10.00);
	}

	@Test
	public void deveCalcularIPI() {
		assertThat(calculadora.calcular("IPI", 100.00)).isEqualTo(20.00);
	}
	
	@Test
	public void deveCalcularNovoImposto() {
		assertThat(calculadora.calcular("NOVO_IMPOSTO", 100.00)).isEqualTo(50.00);
	}
}
