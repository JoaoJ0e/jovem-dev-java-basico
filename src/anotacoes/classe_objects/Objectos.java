package anotacoes.classe_objects;

import java.util.Objects;

public class Objectos {

	public static void main(String[] args) {
		
		String a = "abc";
		String b = "abc";
		String c = null;
		
		
		System.out.println(a.equals(b));
		//System.out.println(c.equals(a)); // Throws NullPointer
		
		System.out.println(Objects.equals(c, a)); // Evita NullPointer
		
	}
	
	
	
}
