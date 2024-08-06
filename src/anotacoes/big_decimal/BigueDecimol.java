package anotacoes.big_decimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigueDecimol {
	
	public static void main(String[] args) {
		
		double d = 0.1 + 0.2;
		System.out.println(d);
		// Impreciso
		
		BigDecimal numero1 = BigDecimal.valueOf(0.1);
		BigDecimal numero2 = BigDecimal.valueOf(0.2);
		System.out.println(numero1.add(numero2));
		
		// é possível adicionar, subtrair, etc usando métodos
		
		
		System.out.println(Math.pow(100, 200));
		System.out.println(BigDecimal.valueOf(101).pow(200));
		
		BigDecimal b = BigDecimal.valueOf(50);
		b.add(BigDecimal.valueOf(100));
		System.out.println(b);
		
		
		b = b.add(BigDecimal.valueOf(100)); // Precisa guardar os valores da operação em algum lugar
		System.out.println(b);
		
		BigDecimal n1 = BigDecimal.valueOf(2);
		BigDecimal n2 = BigDecimal.valueOf(3);
		
		System.out.println(n1.divide(n2, 5, RoundingMode.HALF_EVEN));

		
		
		
	}
	
}
