package br.univille.poo.heranca;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.junit.Test;

public class HerancaTests {
	
	
	@Test
	public void fazerHeranca() {
		Base base = HerancaExercicios.realizarHeranca();
		
		assertEquals("Exercicio 001 : Realizar uma heranca da classe Base",
				"Filha",
				base.getClass().getSimpleName());
	}
	
	@Test
	public void realizarSobreescritaDeMetodo() {
		Base base = HerancaExercicios.realizarSobreescritaDeMetodo();
		assertEquals("Exercicio 002 : Realizar uma sobreescrita do metodo da classe Base",
				base.metodo(),
				"Classe Filha.java");
	}
	
	@Test
	public void realizarSobreescritaDeMetodo2() {
		Base base = HerancaExercicios.realizarSobreescritaDeMetodo2();
		assertEquals("Exercicio 003 : Realizar uma sobreescrita do metodo2 classe Base",
				base.metodo2(),
				"Metodo da classe Base.Metodo da classe Filha.");
	}
	
	@Test
	public void identificarTipoDoObjeto() {
		Object[] objects = new Object[5];
		objects[0] = new Object();
		objects[1] = new Base();
		objects[2] = new Object();
		objects[3] = new Base();
		objects[4] = new Base();
		int quantidade = HerancaExercicios.identificarTipoDoObjeto(objects);
		assertEquals("Exercicio 004 : Realizar uma sobreescrita do metodo2 classe Base",
				3,
				quantidade);
	}
	
	@Test
	public void fazerHerancaFinal() {
		Base base = HerancaExercicios.fazerHerancaFinal();
		
		
		assertEquals("Exercicio 005 : Realizar uma heranca da classe Base",
				"FilhaFinal",
				base.getClass().getSimpleName());
		assertEquals("Exercicio 005 : Marcou como classe final",
				true,
				Modifier.isFinal(base.getClass().getModifiers()));
	}
	
	@Test
	public void realizarSobreescritaDeMetodoFinal() {
		Base base = HerancaExercicios.realizarSobreescritaDeMetodoFinal();
		
		boolean metodoFinal = false;
		try {
		  Method methodToFind = base.getClass().getMethod("metodo", (Class<?>[]) null);
		  metodoFinal = Modifier.isFinal(methodToFind.getModifiers());
		} catch (NoSuchMethodException | SecurityException e) {
			  fail();
		}
		
		assertEquals("Exercicio 006 : Marcou como final o metodo",
				true,
				metodoFinal);
	}
	
	
	

}
