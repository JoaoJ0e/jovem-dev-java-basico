package aula2.poo.exercicio4;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		carro1.setModelo("Fusca");
		carro1.setAno(1978);
		carro1.setCor("Preto");
		
		Carro carro2 = new Carro();
		carro2.setModelo("C3");
		carro2.setAno(2013);
		carro2.setCor("Branco");
		
		Carro carro3 = new Carro();
		carro3.setModelo("Fusion");
		carro3.setAno(2004);
		carro3.setCor("Rosa");
		
		String msg = imprimeCarro(carro1) + "\n\n"
					+ imprimeCarro(carro2)+ "\n\n"
					+ imprimeCarro(carro3);
		
		JOptionPane.showMessageDialog(null, msg);
		
		
	}

	public static String imprimeCarro(Carro carro) {
		return "Modelo: " + carro.getModelo()
					+"\nAno: " + carro.getAno()
					+"\nCor: " + carro.getCor();
		
	}
	
}
