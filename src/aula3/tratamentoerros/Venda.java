package aula3.tratamentoerros;

import java.util.ArrayList;

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
				msg += "\t-> " + i.getNome() + "\n\t---> Preço: R$ " + i.getPreco() + "\n\n";
				total += i.getPreco();
			}			
			
			msg += "===TOTAL: R$ "+ total + "===" + "\n\n------ VOLTE SEMPRE! ------";
			
		return msg;
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
	public void setItens(ArrayList<Item> itens) {
		this.itens = itens;
	}

}
