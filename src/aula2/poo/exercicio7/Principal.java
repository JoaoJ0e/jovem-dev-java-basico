package aula2.poo.exercicio7;

public class Principal {

	public static void main(String[] args) {
		
		NotaFiscal nf1 = new NotaFiscal();
		nf1.setEmitente("Pedro Enterprises");		
		nf1.calculaValor(500, 5);
		
		NotaFiscal nf2 = new NotaFiscal();
		nf2.setEmitente("João Incorporated");		
		nf2.calculaValor(900, 1000);
		
		System.out.println(nf1.getValor() + "  " + nf2.getValor());
		
	}
	
}
