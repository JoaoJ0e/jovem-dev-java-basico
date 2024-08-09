package avaliacao.semana2.personagens;

import java.util.Random;

import avaliacao.semana2.util.PersonagemDerrotadoException;

public abstract class Personagem {

	protected String nome;
	protected int maxHp;
	protected int hp;
	protected int ataque;
	protected int defesa;
	
	protected Personagem() {
	}
	

	public void batalhar(Personagem inimigo) throws InterruptedException {
		do {
			
			int ataqueTurno = 0;
			// Atacando o inimigo
			try {
				ataqueTurno = this.atacar(inimigo);
				System.out.println(mostraAtaque(ataqueTurno, this, inimigo));
				Thread.sleep(750);
			} catch (PersonagemDerrotadoException e) {
				System.out.println();
				Thread.sleep(750);
				break;
			}
			
			// Sendo atacado pelo inimigo
			try {
				ataqueTurno = inimigo.atacar(this);
				System.out.println(mostraAtaque(ataqueTurno, inimigo, this));
				Thread.sleep(750);
			} catch (PersonagemDerrotadoException t) {
				System.out.println();
				break;
			}
			
			System.out.println();
		} while (true);

	}

	public int atacar(Personagem inimigo) throws PersonagemDerrotadoException {
		Random dado = new Random();

		int modificador = dado.nextInt(6);

		if (this.getAtaque() + modificador > inimigo.getDefesa()) {
			inimigo.tomaDano((this.getAtaque() + modificador) - inimigo.getDefesa());

			if (inimigo.getHp() <= 0) {
				throw new PersonagemDerrotadoException(inimigo, this);
			}
			return (this.getAtaque() + modificador) - inimigo.getDefesa();
		}
		return 0;
	}

	protected String mostraAtaque(int ataque, Personagem atacante, Personagem defensor) {
		
		if (ataque > 0) {
			return String.format(
					"<=|»»»»» %s atacou %s >>> %s DANO -> HP %s/%s"
					,atacante.getNome(),  defensor.getNome(), ataque+"", defensor.getHp()+"", defensor.getMaxHp()+"" );
		} else {
			return String.format(
					"▒▒▒░░░░░ %s errou seu ataque em  %s"
					,atacante.getNome(), defensor.getNome());
		}
		
	}
	
	protected void tomaDano(int dano) {
		if (dano < hp) {
			this.hp -= dano;
		} else {
			this.hp = 0;
		}
	}

	public String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected int getMaxHp() {
		return maxHp;
	}

	protected void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	public int getHp() {
		return hp;
	}

	protected void setHp(int hp) {
		this.hp = hp;
	}

	protected int getAtaque() {
		return ataque;
	}

	protected void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	protected int getDefesa() {
		return defesa;
	}

	protected void setDefesa(int defesa) {
		this.defesa = defesa;
	}

	
	
}
