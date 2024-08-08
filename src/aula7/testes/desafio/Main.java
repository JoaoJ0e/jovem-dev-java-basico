package aula7.testes.desafio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

import aula6.outros.util.Evento;
import aula6.outros.util.TipoEventoEnum;

public class Main {

	public static void main(String[] args) {

		new Main();

	}

	public Main() {

	}

	public void mostraDados(Map<Boolean, List<Evento>> mapa) {
		StringBuilder passados = new StringBuilder();
		StringBuilder pendentes = new StringBuilder();

		if (mapa.get(true) == null) {
			passados.append("Nenhum evento passado nesta categoria");
		} else {
			passados.append(mapa.get(true));
		}
		if (mapa.get(false) == null) {
			pendentes.append("Nenhum evento pendente nesta categoria");
		} else {
			pendentes.append(mapa.get(false));
		}

		JOptionPane.showMessageDialog(null, "Eventos passados desta categoria:\n" + passados.toString());
		JOptionPane.showMessageDialog(null, "Eventos pendentes desta categoria:\n" + pendentes.toString());
	}

	public Map<Boolean, List<Evento>> organizaEvento(List<Evento> lista) {
		Map<Boolean, List<Evento>> mapa = lista.stream().filter(e -> e.getTipoEvento().equals(escolheTipo()))
				.collect(Collectors.groupingBy(e -> e.getDataHora().isBefore(LocalDateTime.now())));

		return mapa;
	}

	public TipoEventoEnum escolheTipo() {

		boolean stop = false;

		do {
			try {
				String op = JOptionPane
						.showInputDialog("Escolha o tipo de evento:\nSOCIAL\nLAZER\nPROFISSIONAL\nOUTROS")
						.toUpperCase();

				TipoEventoEnum tipo = TipoEventoEnum.valueOf(op);
				stop = true;
				return tipo;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
				stop = false;
			}
		} while (stop);

		return null;
	}

	public void cadastraNovoEvento(List<Evento> lista) {
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
	}

}
