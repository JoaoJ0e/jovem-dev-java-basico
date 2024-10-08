package aula6.outros.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Evento {

	private String descricao;
	private LocalDateTime dataHora;
	private TipoEventoEnum tipoEvento;

	public Evento() {
	}

	public Evento(String descricao, LocalDateTime dataHora, TipoEventoEnum tipoEvento) {
		this.descricao = descricao;
		this.dataHora = dataHora;
		this.tipoEvento = tipoEvento;
	}


	public void validaDataHora() {
		boolean inputValido = false;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");
		do {
			String dateEventoStr = JOptionPane.showInputDialog("Insira a Hora e Data do Evento (HH:mm dd/MM/yyyy)");
			try {
				LocalDateTime dateEvento = LocalDateTime.parse(dateEventoStr, formatter);
				setDataHora(dateEvento);
				inputValido = true;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Erro: Data inválida!");
			}
		} while (!inputValido);
	}

	public void validaTipoEvento() {
		
		do {
			try {
				String op = JOptionPane
						.showInputDialog("Escolha o tipo de evento:\nSOCIAL\nLAZER\nPROFISSIONAL\nOUTROS")
						.toUpperCase();

				this.tipoEvento = TipoEventoEnum.valueOf(op);

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
			}
		} while (true);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("\nDescrição: ").append(this.descricao)
		.append("\nData e Hora: ").append(this.dataHora)
		.append("\nTipo de Evento: ").append(this.tipoEvento);
		
		return sb.toString();
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public TipoEventoEnum getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(TipoEventoEnum tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

}
