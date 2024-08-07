package aula6.outros.util;

public enum DiaSemanaEnum {
	DOMINGO("Domingo") {
		@Override
		public boolean isFimDeSemana() {
			return true;
		}
	},
	SEGUNDA("Segunda-feira") {
		@Override
		public boolean isFimDeSemana() {
			return false;
		}
	},
	TERCA("Terça-feira") {
		@Override
		public boolean isFimDeSemana() {
			return false;
		}
	},
	QUARTA("Quarta-feira") {
		@Override
		public boolean isFimDeSemana() {
			return false;
		}
	},
	QUINTA("Quinta-feira") {
		@Override
		public boolean isFimDeSemana() {
			return false;
		}
	},
	SEXTA("Sexta-feira") {
		@Override
		public boolean isFimDeSemana() {
			return false;
		}
	},
	SABADO("Sábado") {
		@Override
		public boolean isFimDeSemana() {
			return true;
		}
	};

	private String nome;

	private DiaSemanaEnum(String nome) {
		this.nome = nome;
	}
	// "Quem for herdar de mim precisa implementar este método!"
	public abstract boolean isFimDeSemana();

	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		String fimDeSemana = isFimDeSemana() ? "Sim" : "Não";
		return String.format("%s - Fim de semana? %s", nome, fimDeSemana);
	}

}
