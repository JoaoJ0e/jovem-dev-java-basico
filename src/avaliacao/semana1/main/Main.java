package avaliacao.semana1.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import avaliacao.semana1.utils.Cliente;
import avaliacao.semana1.utils.ClientePremium;
import avaliacao.semana1.utils.ItemVenda;
import avaliacao.semana1.utils.Produto;
import avaliacao.semana1.utils.Venda;

public class Main {

	public static void main(String[] args) {

		/*
		 * Incompleto.
		 * Não consegui implementar a sub-classe ClientePremium corretamente
		 * Antes, eu tinha feito com uma variavel booleana que controlava se o cliente era premium ou não
		 * e dava o desconto baseado nisso. Na versão atual, o desconto premium não funciona. 
		 * 
		 * Também não implementei um method reference, pois não achei onde seria apropriado usar um no meu código.
		 * Se possível, gostaria de receber um feedback do código depois
		 */
		
		String nomeCliente = JOptionPane.showInputDialog("Insira o nome do cliente: ");

		Cliente cliente;
		
		if (nomeCliente.equalsIgnoreCase("thiago")) {
			cliente = new ClientePremium();
		} else {
			cliente = new Cliente();
		}
		System.out.println(cliente.getClass());
		cliente.setNome(nomeCliente);
		cliente.pedeDataNascimento();
		
		Venda venda = new Venda(cliente);
		List<ItemVenda> carrinho = new ArrayList<>();

		String nomeProduto;
		do {
			nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto ('fim' para fechar a venda)");
			if (!nomeProduto.equals("fim")) {
				Produto produto = new Produto(nomeProduto);
				produto.setPreco();

				ItemVenda itemVenda = new ItemVenda(produto);
				itemVenda.setQuantidade();

				carrinho.add(itemVenda);

			}

		} while (!nomeProduto.equals("fim"));

		venda.setItensVenda(carrinho);
		venda.pedeFormaPagamento();
		venda.calculaSubtotal();
		venda.verificaDesconto();
		venda.geraCupom();
		JOptionPane.showMessageDialog(null, venda.getCupom());
	}
	
}
