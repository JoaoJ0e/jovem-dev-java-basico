package avaliacao.semana1.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import avaliacao.semana1.exceptions.InvalidPaymentOptionException;

public class Venda {

	private Cliente cliente;
	private ArrayList<ItemVenda> itensVenda;
	private String formaDePagamento;
	private Double subtotal = 0.0;
	private Double desconto = 1.0;
	private String nomeDesconto;
	private String cupomFiscal = "";
	
	public Venda() {
	}
	
	public Venda(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Venda(ClientePremium cliente) {
		this.cliente = cliente;
	}	
	
	public void calculaSubtotal() {
		itensVenda.forEach(i -> this.subtotal += (i.getProduto().getPreco() * i.getQuantidade()));
	}

	public void pedeFormaPagamento() {
		do {
			try {
				int formaPagamento = Integer.parseInt(JOptionPane.showInputDialog("Escolha a forma de pagamento:"
						+ "\n1 - Cartão de Crédito"
						+ "\n2 - Cartão de Débito"
						+ "\n3 - Dinheiro"));
				
				switch (formaPagamento) {
				
				case 1:
					this.formaDePagamento = "Cartão de Crédito";
					break;
				case 2:
					this.formaDePagamento = "Cartão de Débito";
					break;
				case 3:
					this.formaDePagamento = "Dinheiro";
					break;
				default:
					throw new InvalidPaymentOptionException();
				
				}
				
			} catch (InvalidPaymentOptionException e){
				JOptionPane.showMessageDialog(null, "Erro: Forma de pagamento inválida. Escolha uma das opções disponíveis");
			}
		} while (this.formaDePagamento == null || this.formaDePagamento.equals(""));
	}
		
	public void verificaDesconto() {
		// Desconto de aniversário
		if (cliente.getDataNascimento().getMonthValue() == LocalDate.now().getMonthValue()
				&& cliente.getDataNascimento().getDayOfMonth() == LocalDate.now().getDayOfMonth()) {
			this.desconto = 0.7;
			this.nomeDesconto = "Descto. 30% - Aniversariante";
		// Desconto de Cliente Premium
	
		} else if (cliente.getClass().equals("class avaliacao.semana1.utils.ClientePremium")) {
			this.desconto = 0.8;
			this.nomeDesconto = "Descto. 20% - Cliente Premium";
		// Desconto para pessoas acima de 60 anos
		} else if (cliente.getDataNascimento().compareTo(LocalDate.now()) <= -60) {
			this.desconto = 0.9;
			this.nomeDesconto = "Descto. 10% - Acima de 60 anos";
		// Sem descontos
		} else {
			this.desconto = 1.0;
			this.nomeDesconto = "Sem descontos";
		}
		
		
		
	}
	
	public void geraCupom() {
		cupomFiscal += "************ CUPOM ************\n";
		this.itensVenda.forEach(s -> 
			cupomFiscal += s.getProduto().getNome() 
					+ "\n" + s.getQuantidade()+"x " + String.format("%.2f", s.getProduto().getPreco())
					+ "   ................ " + String.format("%.2f", (s.getProduto().getPreco() * s.getQuantidade()))
					+ "\n"
	);
		
		cupomFiscal += "\nSubtotal ................ " + this.subtotal
				+ "\n" + this.nomeDesconto
				+ "\n\nTotal ................. " + this.subtotal * this.desconto
				+ "\nForma de Pagamento: " + this.formaDePagamento
				+ "\nCliente: " + cliente.mascaraNome();
	}
	
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<ItemVenda> getItensVenda() {
		return itensVenda;
	}

	public void addItemVenda(ItemVenda item) {
		this.itensVenda.add(item);
	}
	
	public void setItensVenda(List<ItemVenda> itensVenda) {
		this.itensVenda = (ArrayList<ItemVenda>) itensVenda;
	}

	public String getFormaDePagamento() {
		return formaDePagamento;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public Double getDesconto() {
		return desconto;
	}

	public String getCupom() {
		return cupomFiscal;
	}

}
