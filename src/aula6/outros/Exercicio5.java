package aula6.outros;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {
		Integer circunferencia = Integer.parseInt(JOptionPane.showInputDialog("Insira a medida da circunferencia:"));
		
		BigDecimal raio = BigDecimal.valueOf(circunferencia)
				.divide(
						BigDecimal.valueOf(2.0)
						.multiply((BigDecimal.valueOf(Math.PI)))
						, 4, RoundingMode.HALF_EVEN);

		
		System.out.println(raio);
		
	}
	
}
