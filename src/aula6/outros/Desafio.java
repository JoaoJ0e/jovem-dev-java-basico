package aula6.outros;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import aula6.outros.util.Evento;
import aula6.outros.util.TipoEventoEnum;

public class Desafio {

	public static void main(String[] args) {

		List<Evento> lista = new ArrayList<>();

		Evento evento;

		do {
			evento = new Evento();
			String descricao = JOptionPane.showInputDialog("Insira a descricao do evento ('fim' para encerrar)");

			if (descricao.equalsIgnoreCase("fim")) {
				break;
			}
			
			evento.setDescricao(descricao);
			evento.validaDataHora();
			evento.validaTipoEvento();
			lista.add(evento);
			

		} while (true);
		int op = 0;
		do {
			try {
				op = Integer.parseInt(JOptionPane.showInputDialog(
						"Agora, escolha um tipo de evento para filtragem:\n1 - SOCIAL\n2 - LAZER\n3 - PROFISSIONAL\n4 - OUTROS"));
				
				if (op < 1 || op > 4) {
					throw new IllegalArgumentException("Opcao Inválida");
				}
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
			}
		} while (true);
		
		int test = op;
		
		StringBuilder sb = new StringBuilder();

		
		
		try { // Eventos que ja passaram
			sb.append("Eventos desta categoria que já passaram:");
			lista.stream().filter(e -> e.getTipoEvento().equals(TipoEventoEnum.getPorId(test))).filter(e -> e.getDataHora().isBefore(LocalDateTime.now())).forEach(sb::append);
			
			// Eventos que estao por vir
			sb.append("\nEventos desta categoria que estão por vir:");
			lista.stream().filter(e -> e.getTipoEvento().equals(TipoEventoEnum.getPorId(test))).filter(e -> e.getDataHora().isAfter(LocalDateTime.now())).forEach(sb::append);
			
		} catch (NullPointerException e) {
			sb.append("Erro: Nenhum evento cadastrado");
		}
		
		if (sb.length() == 83) {
			sb.delete(0, sb.length());
			sb.append("Nenhum evento existe nessa categoria");
		}
		
		System.out.println(sb.length());
		JOptionPane.showMessageDialog(null, sb);

	}
}
