package aula2.poo.desafio;

import java.util.ArrayList;
import java.util.Comparator;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Carro> listaCarros = new ArrayList<>();
		
		String input = "";
		do {
			input = JOptionPane.showInputDialog("Digite um modelo ('fim' para encerrar)").toLowerCase();
			if (!input.equals("fim")) {
				Carro c = new Carro();
				c.setModelo(input);
				input = JOptionPane.showInputDialog("Digite o ano desse modelo (yyyy)");
				c.setAno(Integer.parseInt(input));
				listaCarros.add(c);
			}
		} while (!input.equals("fim"));

		
		listaCarros.sort(Comparator.comparing(Carro::getAno));
		String msg = "";
		for (Carro c : listaCarros) {
			msg += mostraDados(c) + "\n\n"; 
		};
		System.out.println(msg);

	}
	
	public static String mostraDados(Carro c) {
		return "Modelo: " + c.getModelo() 
		+ "\nAno: " + c.getAno();
	}
}
