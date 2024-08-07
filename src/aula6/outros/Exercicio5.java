package aula6.outros;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JOptionPane;

public class Exercicio5 {
	
	public BigDecimal calculaRaio(double circunferencia) {
		return BigDecimal.valueOf(circunferencia)
				.divide(
						BigDecimal.valueOf(2.0)
						.multiply((BigDecimal.valueOf(Math.PI)))
						, 3, RoundingMode.HALF_EVEN);
	}
	
}
