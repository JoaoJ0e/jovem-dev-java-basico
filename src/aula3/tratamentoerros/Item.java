package aula3.tratamentoerros;

public class Item {

	String nome;
	Double preco;
	
	public Item(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	public Item() {
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
