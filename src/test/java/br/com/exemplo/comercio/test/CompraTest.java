package br.com.exemplo.comercio.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.exemplo.comercio.Compra;

public class CompraTest {

	private Compra parcelada;
	private Compra aVista;

	@Before
	public void setUp() {
		this.aVista = new Compra(500);
		this.parcelada = new Compra(4, 1500);
	}

	@Test
	public void deveVerificarCompraAVista() {
		assertEquals(1, aVista.getNumeroDeParcelas());
		assertEquals(500, aVista.getValorTotal());
		assertEquals(500, aVista.getValorParcelas());
	}

	@Test
	public void deveVerificarCompraAParcelada() {
		assertEquals(4, parcelada.getNumeroDeParcelas());
		assertEquals(1500, parcelada.getValorParcelas());
		assertEquals(6000, parcelada.getValorTotal());
	}

}
