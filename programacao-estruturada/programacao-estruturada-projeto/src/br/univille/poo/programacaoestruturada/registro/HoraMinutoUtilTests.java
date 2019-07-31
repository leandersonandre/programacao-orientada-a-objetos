package br.univille.poo.programacaoestruturada.registro;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HoraMinutoUtilTests {
	
	@Test
	public void acrescentaMinutos() {
		HoraMinuto a = new HoraMinuto();
		a.hora = 10;
		a.minuto = 0;
		HoraMinutoUtil.acrescentaMinutos(10);
		
		assertEquals("Hora e minutos sao iguais",10,a.minuto);
	}
	

}
