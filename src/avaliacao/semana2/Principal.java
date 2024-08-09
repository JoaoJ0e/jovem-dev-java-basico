package avaliacao.semana2;

import java.util.ArrayList;
import java.util.List;

import avaliacao.semana2.personagens.Personagem;
import avaliacao.semana2.personagens.herois.Barbaro;
import avaliacao.semana2.personagens.herois.Mago;
import avaliacao.semana2.personagens.herois.Paladino;
import avaliacao.semana2.personagens.inimigos.Arok;
import avaliacao.semana2.personagens.inimigos.Morcego;
import avaliacao.semana2.personagens.inimigos.Urso;
import avaliacao.semana2.personagens.inimigos.Vampiro;
import avaliacao.semana2.personagens.inimigos.Zumbi;

public class Principal {

	public static void main(String[] args) {
		new Principal();
	}

	public Principal() {
		List<Personagem> party = new ArrayList<>();
		party.add(new Mago("Mercer"));
		party.add(new Barbaro("Krod"));
		party.add(new Paladino("Jorge"));

		for (Personagem heroi : party) {
			try {

				List<Personagem> gauntlet = new ArrayList<>();
				gauntlet.add(new Morcego());
				gauntlet.add(new Zumbi());
				gauntlet.add(new Urso());
				gauntlet.add(new Vampiro());
				gauntlet.add(new Arok());

				for (Personagem inimigo : gauntlet) {
					heroi.batalhar(inimigo);
				}
				if (gauntlet.getLast().getHp() == 0) {
					System.out.printf("PARABÉNS, %s! VOCÊ DERROTOU AROK, O MESTRE SUPREMO!\n",
							heroi.getNome().toUpperCase());
				}

				if (heroi.getHp() == 0) {
					System.out.printf("NÃAAAAO! %s FOI DERROTADO!!!!", heroi.getNome().toUpperCase());
				}

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
