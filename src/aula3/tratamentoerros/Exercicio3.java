package aula3.tratamentoerros;

import java.util.ArrayList;
import java.util.ListIterator;

public class Exercicio3 {

	@SuppressWarnings({ "unused", "null" })
	public static void main(String[] args) {

		try {
			int i = 5 / 0;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

		try {
			String s = null;
			s.length();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

		try {
			String nome = "João";
			nome.charAt(4);
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

		try {
			ArrayList<String> lista = new ArrayList<String>();
			lista.add("Pedro");
			ListIterator<String> it = lista.listIterator();
			it.remove();

		} catch (IllegalStateException e) {
			e.printStackTrace();
		}

	}

}
