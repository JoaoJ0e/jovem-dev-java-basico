package anotacoes.enumm;

public class Enums {

	public static void main(String[] args) {
		
		//System.out.println(FormaPagamentoEnum.CARTAO_CREDITO);
 	
		
//		for (FormaPagamentoEnum f : FormaPagamentoEnum.values()) {
//			System.out.println(f);
//		}
		
		FormaPagamentoEnum f = FormaPagamentoEnum.DINHEIRO;
		
//		switch(f) {
//		case CARTAO_CREDITO:
//			// faz uma coisa
//			break;
//		case CARTAO_DEBITO:
//			// faz outra coisa
//			break;
//		case DINHEIRO:
//			// faz mais alguma coisa
//			break;
//		case PIX:
//			// faz o pix
//			break;
//		
//		}
		
		if (f == FormaPagamentoEnum.DINHEIRO) {
			System.out.println("Contando dinheiro");
			System.out.println(f.getDesconto());
		}
		
		if (FormaPagamentoEnum.CARTAO_CREDITO.equals(f)) {
			System.out.println("Pagando Taxa");
			System.out.println(f.getDesconto());
		}
		
		
	}
	
}
