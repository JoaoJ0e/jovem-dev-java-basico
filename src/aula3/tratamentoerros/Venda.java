package aula3.tratamentoerros;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import aula3.tratamentoerros.exceptions.PrecoIncorretoException;
import aula3.tratamentoerros.exceptions.VendaException;

public class Venda {

	String nomeCliente;
	ArrayList<Item> itens;

	public String geraCupomFiscal() {
		String msg = "";
		msg += "------ CUPOM FISCAL ------\n\n"
			+ "-> Nome do cliente: " + this.nomeCliente + "   "
			+ "\n-> Quantidade de itens: " + this.itens.size()  + "   "
			+ "\n----------------\n►Produtos comprados: \n";

		double total = 0;
		for (Item i : itens) {
			msg += "\t-> " + i.getNome() + "\n\t---> Preço: R$ " + String.format("%.2f", i.getPreco()) + "\n\n";
			total += i.getPreco();
		}

		msg += "===TOTAL: R$ " + String.format("%.2f", total) + "===" + "\n\n------ VOLTE SEMPRE! ------";

		return msg;
	}

	public void setItens() throws VendaException {
		int qtdItens = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de itens:"));
		if (qtdItens < 1 || qtdItens > 10) {
			throw new VendaException("Quantidade inválida: Insira uma quantidade de 1 à 10.");
		}

		ArrayList<Item> listaItens = new ArrayList<>();

		for (int i = 0; i < qtdItens; i++) {
			Item item = new Item();
			item.nome = JOptionPane.showInputDialog("Insira o nome do " + (i + 1) + "º item: ");
			do {
				item.preco = Double.parseDouble(JOptionPane.showInputDialog("Insira o preço do  item: "));
				try {
					if (item.preco <= 0) {
						throw new PrecoIncorretoException("Valor não pode ser menor ou igual a zero.");
					}
				} catch (PrecoIncorretoException e) {
					JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
				}
			} while (item.preco <= 0);
			listaItens.add(item);
		}
		this.itens = listaItens;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public ArrayList<Item> getItens() {
		return itens;
	}

}
