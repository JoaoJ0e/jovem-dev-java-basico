package aula2.poo.exercicio7;

import javax.swing.JOptionPane;

public class NotaFiscal {

	private String emitente;
	private double valor;
	
	
	public String getEmitente() {
		return emitente;
	}
	public void setEmitente(String emitente) {
		this.emitente = emitente;
	}
	public double getValor() {
		return valor;
	}
	public void calculaValor(double vlrProd, double percDesc) {
		
		if (percDesc >= 100) {
			JOptionPane.showMessageDialog(null, "Erro: Desconto de 100% ou mais não pode ser aplicado ao produto");
			this.valor = vlrProd;
		} else if (percDesc < 0){
			JOptionPane.showMessageDialog(null, "Erro: Impossivel aplicar desconto negativo ao produto");
			this.valor = vlrProd;
		} else {
			this.valor = vlrProd - (vlrProd * (percDesc/100));		
		}
	}
}
