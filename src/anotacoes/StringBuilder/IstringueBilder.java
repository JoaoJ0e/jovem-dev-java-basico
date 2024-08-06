package anotacoes.StringBuilder;

public class IstringueBilder {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Bom dia, ");
		sb.append("NOME_USUARIO");
		sb.append("! Estamos usando nosso StringBuilder,");
		sb.append(" esperamos que goste!");
		sb.append("\n\nAt. te,\n");
		sb.append("\tJoão");

		System.out.println(sb.toString());
		
	}
	
}
