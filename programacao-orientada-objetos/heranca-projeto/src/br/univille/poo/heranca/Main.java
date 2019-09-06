package br.univille.poo.heranca;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public final class Main extends Base{
	
	public final String metodo() {
		return null;
	}

	
	  public static void main(String[] args) {
		  Base base = new Main();
		 
		  try {
			  Method methodToFind = base.getClass().getMethod("metodo", (Class<?>[]) null);
			  System.out.println(Modifier.isFinal(methodToFind.getModifiers()));
		  } catch (NoSuchMethodException | SecurityException e) {
			  // Your exception handling goes here
		  }
		  
		  
	  }
}
