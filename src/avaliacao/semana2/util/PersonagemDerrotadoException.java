package avaliacao.semana2.util;

import avaliacao.semana2.personagens.Personagem;

@SuppressWarnings("serial")
public class PersonagemDerrotadoException extends Exception{

	public PersonagemDerrotadoException(Personagem atacante, Personagem inimigo) {
		System.out.println("X " + atacante.getNome() + " foi derrotado por " + inimigo.getNome());
	}

}