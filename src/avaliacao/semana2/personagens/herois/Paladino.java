package avaliacao.semana2.personagens.herois;

import avaliacao.semana2.personagens.Personagem;

public class Paladino extends Personagem {

	public Paladino(String nome) {
		this.nome = nome;
		this.maxHp = 50;
		this.hp = maxHp;
		this.ataque = 20;
		this.defesa = 19;
	}

}