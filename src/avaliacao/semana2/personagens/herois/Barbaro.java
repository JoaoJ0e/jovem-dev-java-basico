package avaliacao.semana2.personagens.herois;

import avaliacao.semana2.personagens.Personagem;

public class Barbaro extends Personagem {

	public Barbaro(String nome) {
		this.nome = nome;
		this.maxHp = 100;
		this.hp = maxHp;
		this.ataque = 20;
		this.defesa = 18;
	}

}
