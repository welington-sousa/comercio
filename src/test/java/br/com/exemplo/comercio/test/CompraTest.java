package br.com.exemplo.comercio.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.exemplo.comercio.Compra;

public class CompraTest {

	@Before
	public void setUp() {
	}

	@Test
	public void deveVerificarCompraAVista() {
		Compra compra = new Compra(500);

		assertEquals(1, compra.getNumeroDeParcelas());
		assertEquals(500, compra.getValorTotal());
		assertEquals(500, compra.getValorParcelas());
	}

	@Test
	public void deveVerificarCompraAParcelada() {
		Compra compra = new Compra(4, 1500);

		assertEquals(4, compra.getNumeroDeParcelas());
		assertEquals(1500, compra.getValorParcelas());
		assertEquals(6000, compra.getValorTotal());
	}

}
