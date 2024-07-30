package aula2.poo.exercicio8;

public abstract class  Veiculo {

	private String nome;
	private String cor;
	private double velocidadeMax;
	
	
	public abstract void acelerar();
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getVelocidadeMax() {
		return velocidadeMax;
	}
	public void setVelocidadeMax(double velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}
	
}
