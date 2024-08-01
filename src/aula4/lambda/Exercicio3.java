package aula4.lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Exercicio3 {

	public static void main(String[] args) {
		
		List<Aluno> lista = new ArrayList<>();

		
		lista.add(new Aluno("João", 1, (LocalDate.of(2004, 12, 9))));
		lista.add(new Aluno("Pedro", 2, (LocalDate.of(2005, 7, 14))));
		lista.add(new Aluno("Thiago", 3, (LocalDate.of(1987, 3, 25))));
		lista.add(new Aluno("Nasser", 4, (LocalDate.of(2002, 4, 18))));
		lista.add(new Aluno("Nicolas", 5, (LocalDate.of(2001, 2, 5))));
		
		lista.removeIf(a -> a.getNome().startsWith("T") && a.getNome().endsWith("o"));
		lista.forEach(System.out::println);
	}
}
