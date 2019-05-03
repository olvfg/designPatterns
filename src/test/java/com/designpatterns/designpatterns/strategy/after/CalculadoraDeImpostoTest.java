package com.designpatterns.designpatterns.strategy.after;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.designpatterns.strategy.after.CalculadoraDeImposto;
import com.designpatterns.strategy.after.ICMS;
import com.designpatterns.strategy.after.IPI;

public class CalculadoraDeImpostoTest {
	
	private CalculadoraDeImposto calculadora;
	
	@Before
	public void setUp() {
		calculadora = new CalculadoraDeImposto();
	}
	
	@Test
	public void deveCalcularICMS() {
		 ICMS icms = new ICMS(100.00);
		 assertThat(calculadora.calcular(icms)).isEqualTo(10.00);
	}
	
	@Test
	public void deveCalcularIPI() {
		 IPI ipi = new IPI(100.00);
		 assertThat(calculadora.calcular(ipi)).isEqualTo(20.00);
	}
}
