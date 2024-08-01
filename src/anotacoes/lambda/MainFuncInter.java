package anotacoes.lambda;

public class MainFuncInter {

	public static void main(String[] args) {
		
		//									Implementação do método
		FunctionalInterfaceCalculadora c = (v1, v2) -> v1 * v2;
		FunctionalInterfaceCalculadora d = (v1, v2) -> v1 / v2;
		FunctionalInterfaceCalculadora f = (v1, v2) -> Math.pow(v1, v2);
		
		/*	^^^isso
		 *  é a versão resumida
		 *  vvv disso
		 */
		
		FunctionalInterfaceCalculadora g = new FunctionalInterfaceCalculadora() {
			
			@Override
			public Double calcula(Double valor1, Double valor2) {
				return valor1 + valor2;
			}
		};
		
		System.out.println(c.calcula(2.0, 3.0));
		System.out.println(d.calcula(2.0, 3.0));
		System.out.println(f.calcula(2.0, 3.0));
		System.out.println(g.calcula(2.0, 3.0));
		
	}
	
}
