package anotacoes.tratamento_erros;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import aula3.tratamentoerros.Item;
import aula3.tratamentoerros.Venda;
import aula3.tratamentoerros.exceptions.PrecoIncorretoException;
import aula3.tratamentoerros.exceptions.VendaException;

public class Desafio_estudar {

    public static void main(String[] args) {
        Venda venda = new Venda();
        
        try {
            venda.setNomeCliente(promptForClientName());
            ArrayList<Item> itens = promptForItems();
            venda.setItens(itens);
            JOptionPane.showMessageDialog(null, venda.geraCupomFiscal());
        } catch (VendaException | PrecoIncorretoException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida: Por favor, insira um número válido.");
        }
    }

    private static String promptForClientName() {
        return JOptionPane.showInputDialog("Nome do cliente:");
    }

    private static ArrayList<Item> promptForItems() throws VendaException, PrecoIncorretoException {
        int qtdItens = getValidItemQuantity();
        ArrayList<Item> listaItens = new ArrayList<>();

        for (int i = 0; i < qtdItens; i++) {
            String nome = JOptionPane.showInputDialog("Insira o nome do " + (i + 1) + "º item: ");
            double preco = getValidItemPrice();
            listaItens.add(new Item(nome, preco));
        }

        return listaItens;
    }

    private static int getValidItemQuantity() throws VendaException {
        while (true) {
            try {
                int qtdItens = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de itens:"));
                if (qtdItens <= 0 || qtdItens > 10) {
                    throw new VendaException("Quantidade inválida: Insira uma quantidade de 1 à 10.");
                }
                return qtdItens;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida: Por favor, insira um número inteiro.");
            }
        }
    }

    private static double getValidItemPrice() throws PrecoIncorretoException {
        while (true) {
            try {
                double preco = Double.parseDouble(JOptionPane.showInputDialog("Insira o preço do item: "));
                if (preco <= 0) {
                    throw new PrecoIncorretoException("Valor não pode ser menor ou igual a zero.");
                }
                return preco;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida: Por favor, insira um número válido.");
            }
        }
    }
}
