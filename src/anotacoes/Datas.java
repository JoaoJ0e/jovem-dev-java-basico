package anotacoes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		LocalDate nascimento = LocalDate.of(1984, 6, 28);
		LocalDate hoje = LocalDate.now();
		LocalDate parseado = LocalDate.parse("1924-05-23");
		LocalDate dataValidade1 = hoje.plusDays(7);
		LocalDate dataValidade2 = hoje.plusYears(2).plusMonths(2).plusDays(2);
		
		System.out.println(hoje.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println(dataValidade1);
		System.out.println(nascimento);

		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora);
												   //yyyy  M  dd  H  mm
		LocalDateTime compromisso = LocalDateTime.of(2024, 8, 10, 5, 15);
		System.out.println(compromisso);
		
	}

}
