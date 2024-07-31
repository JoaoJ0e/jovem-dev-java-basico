package aula3.tratamentoerros.exceptions;

public class PrecoIncorretoException extends RuntimeException {

	public PrecoIncorretoException() {
		super();
	}
	
	public PrecoIncorretoException(String mensagem) {
		super(mensagem);
	}
	
}
