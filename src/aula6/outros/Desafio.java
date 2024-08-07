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
		lista.add(new Evento("Nome", LocalDateTime.of(2024, 8, 9, 12, 0), TipoEventoEnum.LAZER));
		lista.add(new Evento("Nome", LocalDateTime.of(2024, 8, 9, 12, 0), TipoEventoEnum.LAZER));
		lista.add(new Evento("Nome", LocalDateTime.of(2024, 8, 9, 12, 0), TipoEventoEnum.LAZER));
		lista.add(new Evento("Nome", LocalDateTime.of(2024, 8, 9, 12, 0), TipoEventoEnum.LAZER));
		lista.add(new Evento("Nome", LocalDateTime.of(2024, 8, 9, 12, 0), TipoEventoEnum.LAZER));
		lista.add(new Evento("Nome", LocalDateTime.of(2024, 8, 9, 12, 0), TipoEventoEnum.LAZER));
		
		/*
		
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
		
		*/
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
		
		int categoria = op;
		
		StringBuilder passados = new StringBuilder();
		StringBuilder pendentes = new StringBuilder();

		
		
		try { // Eventos que ja passaram
			passados.append("Eventos desta categoria que já passaram:");
			lista.stream().filter(e -> e.getTipoEvento().equals(TipoEventoEnum.getPorId(categoria))).filter(e -> e.getDataHora().isBefore(LocalDateTime.now())).forEach(passados::append);
			
			// Eventos que estao por vir
			pendentes.append("\nEventos desta categoria que estão por vir:");
			lista.stream().filter(e -> e.getTipoEvento().equals(TipoEventoEnum.getPorId(categoria))).filter(e -> e.getDataHora().isAfter(LocalDateTime.now())).forEach(pendentes::append);
			
		} catch (NullPointerException e) {
			passados.append("Erro: Nenhum evento cadastrado");
			pendentes.delete(op, pendentes.length());
		}
		
		if (passados.toString().equals("Eventos desta categoria que já passaram:")) {
			passados.delete(0, passados.length());
			passados.append("Nenhum evento passado nessa categoria");
		}

		if (pendentes.toString().equals("\nEventos desta categoria que estão por vir:")) {
			pendentes.delete(0, pendentes.length());
			pendentes.append("Nenhum evento pendente nessa categoria");
		}
		
		JOptionPane.showMessageDialog(null, passados + "\n" + pendentes);

	}
}
