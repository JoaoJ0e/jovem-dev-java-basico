package aula6.outros;

public class Exemplo {

	int numero;
	
	public Exemplo(int numero) {
		this.numero = numero;
	}
	public String verificaNumero(int i) {
		
		if (numero != 50) {
			throw new RuntimeException("Numero de segurança incorreto");
		}
		
		if (i == 0) {
			return "ZERO";
		}
		
		throw new IllegalArgumentException("DEVE SER ZERO");
	}
}
